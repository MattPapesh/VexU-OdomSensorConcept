import components.Bot;
import components.Field;
import fundamentals.Constants;
import fundamentals.UI.Controller;
import fundamentals.appbase.AppBase;
import mechanics.DriveBot;

public class AppContainer extends AppBase
{
    // Controllers:
    private Controller translation_controller = super.getController(Constants.CONTROLLER_KEY_IDS.LEFT_ARROW, 
    Constants.CONTROLLER_KEY_IDS.RIGHT_ARROW, Constants.CONTROLLER_KEY_IDS.UP_ARROW, Constants.CONTROLLER_KEY_IDS.DOWN_ARROW);
    private Controller rotation_controller = super.getController(Constants.CONTROLLER_KEY_IDS.KEY_Q, 
    Constants.CONTROLLER_KEY_IDS.KEY_E, 0, 0);

    // Components:
    private Field field = new Field(Constants.FIELD_CHARACTERISTICS.FIELD_X_COORDINATE, 
    Constants.FIELD_CHARACTERISTICS.FIELD_Y_COORDINATE);
    private Bot bot = new Bot(field.getCoordinates().getX(), field.getCoordinates().getY());

    private final int BASE_DELTA_X = 1;
    private final int BASE_DELTA_Y = 1;
    private final int BASE_DELTA_DEGREES = 1;

    public AppContainer()
    {
       
    }

    public void runBotSim()
    {
        if(translation_controller.isLeftPressed())
        {System.err.println("LEFT");
            new DriveBot(bot, -BASE_DELTA_X, 0, 0).schedule();
        }
        else if(translation_controller.isRightPressed())
        {System.err.println("RIGHT");
            new DriveBot(bot, BASE_DELTA_X, 0, 0).schedule();
        }
        else if(translation_controller.isUpPressed())
        {System.err.println("UP");
            new DriveBot(bot, 0, -BASE_DELTA_Y, 0).schedule();
        }
        else if(translation_controller.isDownPressed())
        {System.err.println("DOWN");
            new DriveBot(bot, 0, BASE_DELTA_Y, 0).schedule();
        }
        else if(rotation_controller.isLeftPressed())
        {System.err.println("Q");
            new DriveBot(bot, 0, 0, -BASE_DELTA_DEGREES).schedule();
        }
        else if(rotation_controller.isRightPressed())
        {System.err.println("E");
            new DriveBot(bot, 0, 0, BASE_DELTA_DEGREES).schedule();
        }
    }
}
