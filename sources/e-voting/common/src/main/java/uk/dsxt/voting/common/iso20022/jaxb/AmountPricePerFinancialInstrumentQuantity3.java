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
 * <p>Java class for AmountPricePerFinancialInstrumentQuantity3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountPricePerFinancialInstrumentQuantity3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmtPricTp" type="{}AmountPriceType1Code"/>
 *         &lt;element name="PricVal" type="{}ActiveCurrencyAnd13DecimalAmount"/>
 *         &lt;element name="FinInstrmQty" type="{}FinancialInstrumentQuantity1Choice"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountPricePerFinancialInstrumentQuantity3", propOrder = {
    "amtPricTp",
    "pricVal",
    "finInstrmQty"
})
public class AmountPricePerFinancialInstrumentQuantity3 {

    @XmlElement(name = "AmtPricTp", required = true)
    protected AmountPriceType1Code amtPricTp;
    @XmlElement(name = "PricVal", required = true)
    protected ActiveCurrencyAnd13DecimalAmount pricVal;
    @XmlElement(name = "FinInstrmQty", required = true)
    protected FinancialInstrumentQuantity1Choice finInstrmQty;

    /**
     * Gets the value of the amtPricTp property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPriceType1Code }
     *     
     */
    public AmountPriceType1Code getAmtPricTp() {
        return amtPricTp;
    }

    /**
     * Sets the value of the amtPricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPriceType1Code }
     *     
     */
    public void setAmtPricTp(AmountPriceType1Code value) {
        this.amtPricTp = value;
    }

    /**
     * Gets the value of the pricVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getPricVal() {
        return pricVal;
    }

    /**
     * Sets the value of the pricVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setPricVal(ActiveCurrencyAnd13DecimalAmount value) {
        this.pricVal = value;
    }

    /**
     * Gets the value of the finInstrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getFinInstrmQty() {
        return finInstrmQty;
    }

    /**
     * Sets the value of the finInstrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setFinInstrmQty(FinancialInstrumentQuantity1Choice value) {
        this.finInstrmQty = value;
    }

}
