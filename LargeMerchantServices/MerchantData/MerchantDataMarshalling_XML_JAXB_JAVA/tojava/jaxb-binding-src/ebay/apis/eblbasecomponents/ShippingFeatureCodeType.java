//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 06:08:42 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingFeatureCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingFeatureCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DeliveryConfirmation"/>
 *     &lt;enumeration value="SignatureConfirmation"/>
 *     &lt;enumeration value="StealthPostage"/>
 *     &lt;enumeration value="SaturdayDelivery"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="NotDefined"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingFeatureCodeType")
@XmlEnum
public enum ShippingFeatureCodeType {


    /**
     * 
     * 						Confirmation requested.
     * 					
     * 
     */
    @XmlEnumValue("DeliveryConfirmation")
    DELIVERY_CONFIRMATION("DeliveryConfirmation"),

    /**
     * 
     * 						Signature requested upon receipt.
     * 					
     * 
     */
    @XmlEnumValue("SignatureConfirmation")
    SIGNATURE_CONFIRMATION("SignatureConfirmation"),

    /**
     * 
     * 						Stealth postage.
     * 					
     * 
     */
    @XmlEnumValue("StealthPostage")
    STEALTH_POSTAGE("StealthPostage"),

    /**
     * 
     * 						Saturday delivery.
     * 					
     * 
     */
    @XmlEnumValue("SaturdayDelivery")
    SATURDAY_DELIVERY("SaturdayDelivery"),

    /**
     * 
     * 						Other.
     * 					
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * 
     * 						Not defined.
     * 					
     * 
     */
    @XmlEnumValue("NotDefined")
    NOT_DEFINED("NotDefined"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingFeatureCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingFeatureCodeType fromValue(String v) {
        for (ShippingFeatureCodeType c: ShippingFeatureCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}