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
 * <p>Java class for IfcCostScheduleTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcCostScheduleTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="budget"/>
 *     &lt;enumeration value="costplan"/>
 *     &lt;enumeration value="estimate"/>
 *     &lt;enumeration value="tender"/>
 *     &lt;enumeration value="pricedbillofquantities"/>
 *     &lt;enumeration value="unpricedbillofquantities"/>
 *     &lt;enumeration value="scheduleofrates"/>
 *     &lt;enumeration value="userdefined"/>
 *     &lt;enumeration value="notdefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcCostScheduleTypeEnum")
@XmlEnum
public enum IfcCostScheduleTypeEnum {

    @XmlEnumValue("budget")
    BUDGET("budget"),
    @XmlEnumValue("costplan")
    COSTPLAN("costplan"),
    @XmlEnumValue("estimate")
    ESTIMATE("estimate"),
    @XmlEnumValue("tender")
    TENDER("tender"),
    @XmlEnumValue("pricedbillofquantities")
    PRICEDBILLOFQUANTITIES("pricedbillofquantities"),
    @XmlEnumValue("unpricedbillofquantities")
    UNPRICEDBILLOFQUANTITIES("unpricedbillofquantities"),
    @XmlEnumValue("scheduleofrates")
    SCHEDULEOFRATES("scheduleofrates"),
    @XmlEnumValue("userdefined")
    USERDEFINED("userdefined"),
    @XmlEnumValue("notdefined")
    NOTDEFINED("notdefined");
    private final String value;

    IfcCostScheduleTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcCostScheduleTypeEnum fromValue(String v) {
        for (IfcCostScheduleTypeEnum c: IfcCostScheduleTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
