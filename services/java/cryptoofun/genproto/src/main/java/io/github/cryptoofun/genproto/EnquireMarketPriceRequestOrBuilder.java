// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: market_data_streamer.proto

package io.github.cryptoofun.genproto;

public interface EnquireMarketPriceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EnquireMarketPriceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string timestamp_ms = 1 [json_name = "timestampMs"];</code>
   * @return The timestampMs.
   */
  java.lang.String getTimestampMs();
  /**
   * <code>string timestamp_ms = 1 [json_name = "timestampMs"];</code>
   * @return The bytes for timestampMs.
   */
  com.google.protobuf.ByteString
      getTimestampMsBytes();

  /**
   * <code>string ticker = 2 [json_name = "ticker"];</code>
   * @return The ticker.
   */
  java.lang.String getTicker();
  /**
   * <code>string ticker = 2 [json_name = "ticker"];</code>
   * @return The bytes for ticker.
   */
  com.google.protobuf.ByteString
      getTickerBytes();
}
