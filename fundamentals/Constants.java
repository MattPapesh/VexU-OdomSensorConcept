package fundamentals;

/**
 * All global constants defined in specific sub-classes that were statically declared and defined. 
 */
public class Constants 
{       
    /*
     * All root directories for any assets used. 
     */
    public static final class FILE_ROOT_DIRECTORIES
    {
        public static final String IMAGE_ROOT_DIRECTORY = "assets/images/";
        public static final String AUDIO_ROOT_DIRECTORY = "assets/audio/";
    }

    /*
     * Window characteristics for the window that the application displays on-screen.
     */
    public static final class WINDOW_CHARACTERISTICS
    {
        public static final String[] APP_ICON_IMAGES = {"icon.png", "icon.png"};
        public static final String APP_TITLE = "OdomSensorConcept";
        public static final int WINDOW_WIDTH = 1154;
        public static final int WINDOW_HEIGHT = 595;
        public static final int REFRESH_RATE_MILLIS = 5;
        public static final double GRAPHICS_TRANSFORMATION_SCALER = 1.25;
    }

    public static final class FIELD_CHARACTERISTICS 
    {
        public static final int FIELD_X_COORDINATE = 500;
        public static final int FIELD_Y_COORDINATE = 300;
    }

    public static final class CONTROLLER_KEY_IDS
    {
        public static final int UP_ARROW = 38;
        public static final int DOWN_ARROW = 40;
        public static final int LEFT_ARROW = 37; 
        public static final int RIGHT_ARROW = 39;
        public static final int KEY_E = 69;
        public static final int KEY_Q = 81;
    }
}
