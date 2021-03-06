// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nyct-subway.proto

package sen.khyber.web.subway.client.proto;

import sen.khyber.web.subway.client.proto.NyctTripDescriptor.Direction;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface NyctTripDescriptorOrBuilder extends MessageOrBuilder {
    
    /**
     * <pre>
     * The nyct_train_id is meant for internal use only. It provides an
     * easy way to associated GTFS-realtime trip identifiers with NYCT rail
     * operations identifier
     * The ATS office system assigns unique train identification (Train ID) to
     * each train operating within or ready to enter the mainline of the
     * monitored territory. An example of this is 06 0123+ PEL/BBR and is decoded
     * as follows:
     * The first character represents the trip type designator. 0 identifies a
     * scheduled revenue trip. Other revenue trip values that are a result of a
     * change to the base schedule include; [= reroute], [/ skip stop], [$ turn
     * train] also known as shortly lined service.
     * The second character 6 represents the trip line i.e. number 6 train The
     * third set of characters identify the decoded origin time. The last
     * character may be blank "on the whole minute" or + "30 seconds"
     * Note: Origin times will not change when there is a trip type change.  This
     * is followed by a three character "Origin Location" / "Destination
     * Location"
     * </pre>
     * <p>
     * <code>optional string train_id = 1;</code>
     */
    boolean hasTrainId();
    
    /**
     * <pre>
     * The nyct_train_id is meant for internal use only. It provides an
     * easy way to associated GTFS-realtime trip identifiers with NYCT rail
     * operations identifier
     * The ATS office system assigns unique train identification (Train ID) to
     * each train operating within or ready to enter the mainline of the
     * monitored territory. An example of this is 06 0123+ PEL/BBR and is decoded
     * as follows:
     * The first character represents the trip type designator. 0 identifies a
     * scheduled revenue trip. Other revenue trip values that are a result of a
     * change to the base schedule include; [= reroute], [/ skip stop], [$ turn
     * train] also known as shortly lined service.
     * The second character 6 represents the trip line i.e. number 6 train The
     * third set of characters identify the decoded origin time. The last
     * character may be blank "on the whole minute" or + "30 seconds"
     * Note: Origin times will not change when there is a trip type change.  This
     * is followed by a three character "Origin Location" / "Destination
     * Location"
     * </pre>
     * <p>
     * <code>optional string train_id = 1;</code>
     */
    String getTrainId();
    
    /**
     * <pre>
     * The nyct_train_id is meant for internal use only. It provides an
     * easy way to associated GTFS-realtime trip identifiers with NYCT rail
     * operations identifier
     * The ATS office system assigns unique train identification (Train ID) to
     * each train operating within or ready to enter the mainline of the
     * monitored territory. An example of this is 06 0123+ PEL/BBR and is decoded
     * as follows:
     * The first character represents the trip type designator. 0 identifies a
     * scheduled revenue trip. Other revenue trip values that are a result of a
     * change to the base schedule include; [= reroute], [/ skip stop], [$ turn
     * train] also known as shortly lined service.
     * The second character 6 represents the trip line i.e. number 6 train The
     * third set of characters identify the decoded origin time. The last
     * character may be blank "on the whole minute" or + "30 seconds"
     * Note: Origin times will not change when there is a trip type change.  This
     * is followed by a three character "Origin Location" / "Destination
     * Location"
     * </pre>
     * <p>
     * <code>optional string train_id = 1;</code>
     */
    ByteString getTrainIdBytes();
    
    /**
     * <pre>
     * This trip contains been assigned to a physical train. If true, this trip is
     * already underway or most likely will depart shortly.
     * Train Assignment is a function of the Automatic Train Supervision (ATS)
     * office system used by NYCT Rail Operations to monitor and track train
     * movements. ATS provides the ability to "assign" the nyct_train_id
     * attribute when a physical train is at its origin terminal. These assigned
     * trips have the is_assigned field set in the TripDescriptor.
     * When a train is at a terminal but contains not been given a work program it is
     * declared unassigned and is tagged as such. Unassigned trains can be moved
     * to a storage location or assigned a nyct_train_id when a determination for
     * service is made.
     * </pre>
     * <p>
     * <code>optional bool is_assigned = 2;</code>
     */
    boolean hasIsAssigned();
    
    /**
     * <pre>
     * This trip contains been assigned to a physical train. If true, this trip is
     * already underway or most likely will depart shortly.
     * Train Assignment is a function of the Automatic Train Supervision (ATS)
     * office system used by NYCT Rail Operations to monitor and track train
     * movements. ATS provides the ability to "assign" the nyct_train_id
     * attribute when a physical train is at its origin terminal. These assigned
     * trips have the is_assigned field set in the TripDescriptor.
     * When a train is at a terminal but contains not been given a work program it is
     * declared unassigned and is tagged as such. Unassigned trains can be moved
     * to a storage location or assigned a nyct_train_id when a determination for
     * service is made.
     * </pre>
     * <p>
     * <code>optional bool is_assigned = 2;</code>
     */
    boolean getIsAssigned();
    
    /**
     * <pre>
     * Uptown and Bronx-bound trains are moving NORTH.
     * Times Square Shuttle to Grand Central is also northbound.
     * Downtown and Brooklyn-bound trains are moving SOUTH.
     * Times Square Shuttle to Times Square is also southbound.
     * EAST and WEST are not used currently.
     * </pre>
     * <p>
     * <code>optional .NyctTripDescriptor.Direction direction = 3;</code>
     */
    boolean hasDirection();
    
    /**
     * <pre>
     * Uptown and Bronx-bound trains are moving NORTH.
     * Times Square Shuttle to Grand Central is also northbound.
     * Downtown and Brooklyn-bound trains are moving SOUTH.
     * Times Square Shuttle to Times Square is also southbound.
     * EAST and WEST are not used currently.
     * </pre>
     * <p>
     * <code>optional .NyctTripDescriptor.Direction direction = 3;</code>
     */
    Direction getDirection();
    
}