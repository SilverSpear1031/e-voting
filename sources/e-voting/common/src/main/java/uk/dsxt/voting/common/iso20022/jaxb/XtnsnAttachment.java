//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 03:58:45 PM GMT+03:00 
//


package uk.dsxt.voting.common.iso20022.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XtnsnAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XtnsnAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlNm" type="{}Max256Text"/>
 *         &lt;element name="FlCntnts" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XtnsnAttachment", propOrder = {
    "flNm",
    "flCntnts"
})
public class XtnsnAttachment {

    @XmlElement(name = "FlNm", required = true)
    protected String flNm;
    @XmlElement(name = "FlCntnts", required = true)
    protected byte[] flCntnts;

    /**
     * Gets the value of the flNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlNm() {
        return flNm;
    }

    /**
     * Sets the value of the flNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlNm(String value) {
        this.flNm = value;
    }

    /**
     * Gets the value of the flCntnts property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFlCntnts() {
        return flCntnts;
    }

    /**
     * Sets the value of the flCntnts property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFlCntnts(byte[] value) {
        this.flCntnts = value;
    }

}
