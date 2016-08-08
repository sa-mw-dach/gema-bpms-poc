
package de.agentbase.gema.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getMatchings complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getMatchings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Titel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Autor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dauer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMatchings", propOrder = {
    "titel",
    "autor",
    "datum",
    "dauer"
})
public class GetMatchings {

    @XmlElement(name = "Titel")
    protected String titel;
    @XmlElement(name = "Autor")
    protected String autor;
    @XmlElement(name = "Datum")
    protected String datum;
    @XmlElement(name = "Dauer")
    protected String dauer;

    /**
     * Ruft den Wert der titel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Legt den Wert der titel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Ruft den Wert der autor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Legt den Wert der autor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutor(String value) {
        this.autor = value;
    }

    /**
     * Ruft den Wert der datum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Legt den Wert der datum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatum(String value) {
        this.datum = value;
    }

    /**
     * Ruft den Wert der dauer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDauer() {
        return dauer;
    }

    /**
     * Legt den Wert der dauer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDauer(String value) {
        this.dauer = value;
    }

}
