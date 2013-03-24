package testeur.squash;

import com.squareup.squash.SquashEntry;

public class TestageSquashEntry {

	
	public class TestageSquashEntry extends SquashEntry implements LogEntry {
	    // The API key used for all Android Squash entries.
	    private static final String API_KEY = "YOUR_API_KEY";
	    private static final String CLIENT_ID = "android";
	    private static final String DEBUG = "Debug";
	    private static final String RELEASE = "Release";
	    // Transient so it doesn't try to serialize itself.
	    private transient Gson gson;

	    // Device stuff.
	    private final String device_id;
	    private final String device_type;
	    private final String operating_system;
	    private final boolean rooted;
	    private final String network_operator;
	    private final String network_type;
	    private final String connectivity;
	    private final String orientation;

	    // Location stuff.
	    private final String lat;
	    private final String lon;
	    private final String altitude;
	    private final String location_precision;
	    private final String heading;
	    private final String speed;

	    // Which app am I?
	    private final String app_id;
	}
	
}
