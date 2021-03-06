//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcTankTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcTankTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="basin"/>
 *     &lt;enumeration value="breakpressure"/>
 *     &lt;enumeration value="expansion"/>
 *     &lt;enumeration value="feedandexpansion"/>
 *     &lt;enumeration value="pressurevessel"/>
 *     &lt;enumeration value="storage"/>
 *     &lt;enumeration value="vessel"/>
 *     &lt;enumeration value="userdefined"/>
 *     &lt;enumeration value="notdefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcTankTypeEnum")
@XmlEnum
public enum IfcTankTypeEnum {

    @XmlEnumValue("basin")
    BASIN("basin"),
    @XmlEnumValue("breakpressure")
    BREAKPRESSURE("breakpressure"),
    @XmlEnumValue("expansion")
    EXPANSION("expansion"),
    @XmlEnumValue("feedandexpansion")
    FEEDANDEXPANSION("feedandexpansion"),
    @XmlEnumValue("pressurevessel")
    PRESSUREVESSEL("pressurevessel"),
    @XmlEnumValue("storage")
    STORAGE("storage"),
    @XmlEnumValue("vessel")
    VESSEL("vessel"),
    @XmlEnumValue("userdefined")
    USERDEFINED("userdefined"),
    @XmlEnumValue("notdefined")
    NOTDEFINED("notdefined");
    private final String value;

    IfcTankTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcTankTypeEnum fromValue(String v) {
        for (IfcTankTypeEnum c: IfcTankTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
