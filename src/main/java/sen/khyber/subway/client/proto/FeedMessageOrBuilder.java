// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gtfs-realtime.proto

package sen.khyber.subway.client.proto;

public interface FeedMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:transit_realtime.FeedMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Metadata about this feed and feed message.
   * </pre>
   *
   * <code>required .transit_realtime.FeedHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <pre>
   * Metadata about this feed and feed message.
   * </pre>
   *
   * <code>required .transit_realtime.FeedHeader header = 1;</code>
   */
  sen.khyber.subway.client.proto.FeedHeader getHeader();
  /**
   * <pre>
   * Metadata about this feed and feed message.
   * </pre>
   *
   * <code>required .transit_realtime.FeedHeader header = 1;</code>
   */
  sen.khyber.subway.client.proto.FeedHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * Contents of the feed.
   * </pre>
   *
   * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
   */
  java.util.List<sen.khyber.subway.client.proto.FeedEntity> 
      getEntityList();
  /**
   * <pre>
   * Contents of the feed.
   * </pre>
   *
   * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
   */
  sen.khyber.subway.client.proto.FeedEntity getEntity(int index);
  /**
   * <pre>
   * Contents of the feed.
   * </pre>
   *
   * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
   */
  int getEntityCount();
  /**
   * <pre>
   * Contents of the feed.
   * </pre>
   *
   * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
   */
  java.util.List<? extends sen.khyber.subway.client.proto.FeedEntityOrBuilder> 
      getEntityOrBuilderList();
  /**
   * <pre>
   * Contents of the feed.
   * </pre>
   *
   * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
   */
  sen.khyber.subway.client.proto.FeedEntityOrBuilder getEntityOrBuilder(
      int index);
}