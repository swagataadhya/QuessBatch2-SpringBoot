package com.program.MicroServiceDemo2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("myapp")
public class Number {
    public float max,min;
    public Number()
    {

    }
    public Number(float a,float b)
    {
        this.max=a;
        this.min=b;
    }
    public void setMax(float a)
    {
        this.max=a;
    }
    public void setMin(float b)
    {
        this.min=b;
    }

    public float getMax()
    {
        return this.max;
    }
    public float getMin() //java s default access specifier is public right?so it should be public automatically if I don't give access specifier. then why its not working here?
    {
        return this.min;
    }


}
