package mechanics;

import components.Bot;
import fundamentals.mechanic.MechanicBase;

public class DriveBot extends MechanicBase
{
    private Bot bot = null;
    private int delta_x = 0;
    private int delta_y = 0;
    private int delta_degrees = 0;

    public DriveBot(Bot bot, int delta_x, int delta_y, int delta_degrees)
    {
        this.bot= bot; 
        this.delta_x = delta_x;
        this.delta_y = delta_y;
        this.delta_degrees = delta_degrees;

        addRequirements(bot);
        setExecutionalPeriodicDelay(10);
    }    

    @Override
    public void initialize()
    {
        bot.translate(delta_x, delta_y, delta_degrees);
        super.cancel();
    }

    @Override
    public void execute() {}

    @Override 
    public void end(boolean interrupted) {}

    @Override
    public boolean isFinished()
    {
        return false;
    }
}
