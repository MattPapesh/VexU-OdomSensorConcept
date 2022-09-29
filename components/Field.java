package components;

import fundamentals.animation.Animation;
import fundamentals.component.ComponentBase;

public class Field extends ComponentBase
{
    private Animation field_anim = new Animation("field.png");

    public Field(int x, int y)
    {
        addRequirements(x, y, 0, field_anim);
        setAnimation(field_anim.getName());
    }    
}
