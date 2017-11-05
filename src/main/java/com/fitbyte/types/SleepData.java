package com.fitbyte.types;


import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SleepData {
    @XmlElement(name="numberOfHours")
    private int m_numberOfHours;

    @XmlElement(name="quality")
    private int m_quality;

    public SleepData() { //This is needed for MOX JSON to work.

    }

    public void setNumberOfHours(int numberOfHours) {
        m_numberOfHours = numberOfHours;
    }

    public int getNumberOfHours() {
        return m_numberOfHours;
    }

    public void setQuality(int quality) {
        m_quality = quality;
    }

    public int getQuality() {
        return m_quality;
    }
    //Will need to override methods: equals and hashcode
}