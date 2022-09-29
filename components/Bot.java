package components;

import fundamentals.Coordinates;
import fundamentals.animation.Animation;
import fundamentals.component.ComponentBase;

public class Bot extends ComponentBase
{
    private Animation bot_anim = new Animation("bot.png");
    
    public Bot(int x, int y)
    {
        addRequirements(x, y, 0, bot_anim);
        setAnimation(bot_anim.getName());
    }

    public void translate(int delta_x, int delta_y, int delta_degrees)
    {
        Coordinates initial_coords = getCoordinates();
        setCoordinates(initial_coords.getX() + delta_x, initial_coords.getY() + delta_y, initial_coords.getDegrees() + delta_degrees);
    }
}
