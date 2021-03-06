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
 * <p>Java class for aggregateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="aggregateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="array"/>
 *     &lt;enumeration value="list"/>
 *     &lt;enumeration value="set"/>
 *     &lt;enumeration value="bag"/>
 *     &lt;enumeration value="array-unique"/>
 *     &lt;enumeration value="array-optional"/>
 *     &lt;enumeration value="array-optional-unique"/>
 *     &lt;enumeration value="list-unique"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "aggregateType")
@XmlEnum
public enum AggregateType {

    @XmlEnumValue("array")
    ARRAY("array"),
    @XmlEnumValue("list")
    LIST("list"),
    @XmlEnumValue("set")
    SET("set"),
    @XmlEnumValue("bag")
    BAG("bag"),
    @XmlEnumValue("array-unique")
    ARRAY_UNIQUE("array-unique"),
    @XmlEnumValue("array-optional")
    ARRAY_OPTIONAL("array-optional"),
    @XmlEnumValue("array-optional-unique")
    ARRAY_OPTIONAL_UNIQUE("array-optional-unique"),
    @XmlEnumValue("list-unique")
    LIST_UNIQUE("list-unique");
    private final String value;

    AggregateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AggregateType fromValue(String v) {
        for (AggregateType c: AggregateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
