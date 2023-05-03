// Packages
const helmet = require('helmet');
const cors = require('cors');
const xss = require('xss-clean');
const grpcServer = require('./grpc/server');
var grpc = require('@grpc/grpc-js');

// express
const express = require('express');
const app = express();

// Routers
const walletRouter = require('./routers/walletRoutes')

app.use(helmet());
app.use(cors());
app.use(xss());
app.use(express.json());

app.use('/', walletRouter);

const port = process.env.PORT || 5000;
const start = async () => {
  try {
    app.listen(port, () =>
      console.log(`Server is listening on port ${port}...`)
    );
  } catch (error) {
    console.log(error);
  }
};

const grpcStart = async () => {
  grpcServer.bindAsync('0.0.0.0:50051', grpc.ServerCredentials.createInsecure(), () => {
    grpcServer.start();
    console.log(`grpc server is listening...`)
  });
};

grpcStart();
start();