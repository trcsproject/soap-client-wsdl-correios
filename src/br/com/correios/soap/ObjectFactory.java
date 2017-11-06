
package br.com.correios.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.correios.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CResultado_QNAME = new QName("http://tempuri.org/", "cResultado");
    private final static QName _CResultadoObjeto_QNAME = new QName("http://tempuri.org/", "cResultadoObjeto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.correios.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcPrecoData }
     * 
     */
    public CalcPrecoData createCalcPrecoData() {
        return new CalcPrecoData();
    }

    /**
     * Create an instance of {@link CalcPrazoResponse }
     * 
     */
    public CalcPrazoResponse createCalcPrazoResponse() {
        return new CalcPrazoResponse();
    }

    /**
     * Create an instance of {@link CResultado }
     * 
     */
    public CResultado createCResultado() {
        return new CResultado();
    }

    /**
     * Create an instance of {@link CalcPrecoPrazoData }
     * 
     */
    public CalcPrecoPrazoData createCalcPrecoPrazoData() {
        return new CalcPrecoPrazoData();
    }

    /**
     * Create an instance of {@link CalcPrecoPrazoRestricao }
     * 
     */
    public CalcPrecoPrazoRestricao createCalcPrecoPrazoRestricao() {
        return new CalcPrecoPrazoRestricao();
    }

    /**
     * Create an instance of {@link CalcPrecoFACResponse }
     * 
     */
    public CalcPrecoFACResponse createCalcPrecoFACResponse() {
        return new CalcPrecoFACResponse();
    }

    /**
     * Create an instance of {@link CalcPrazoData }
     * 
     */
    public CalcPrazoData createCalcPrazoData() {
        return new CalcPrazoData();
    }

    /**
     * Create an instance of {@link CalcPrecoPrazoResponse }
     * 
     */
    public CalcPrecoPrazoResponse createCalcPrecoPrazoResponse() {
        return new CalcPrecoPrazoResponse();
    }

    /**
     * Create an instance of {@link CalcPrecoResponse }
     * 
     */
    public CalcPrecoResponse createCalcPrecoResponse() {
        return new CalcPrecoResponse();
    }

    /**
     * Create an instance of {@link CResultadoObjeto }
     * 
     */
    public CResultadoObjeto createCResultadoObjeto() {
        return new CResultadoObjeto();
    }

    /**
     * Create an instance of {@link CalcPrazoObjetoResponse }
     * 
     */
    public CalcPrazoObjetoResponse createCalcPrazoObjetoResponse() {
        return new CalcPrazoObjetoResponse();
    }

    /**
     * Create an instance of {@link CalcPrecoDataResponse }
     * 
     */
    public CalcPrecoDataResponse createCalcPrecoDataResponse() {
        return new CalcPrecoDataResponse();
    }

    /**
     * Create an instance of {@link CalcPreco }
     * 
     */
    public CalcPreco createCalcPreco() {
        return new CalcPreco();
    }

    /**
     * Create an instance of {@link CalcPrazoRestricao }
     * 
     */
    public CalcPrazoRestricao createCalcPrazoRestricao() {
        return new CalcPrazoRestricao();
    }

    /**
     * Create an instance of {@link CalcPrecoFAC }
     * 
     */
    public CalcPrecoFAC createCalcPrecoFAC() {
        return new CalcPrecoFAC();
    }

    /**
     * Create an instance of {@link CalcPrazo }
     * 
     */
    public CalcPrazo createCalcPrazo() {
        return new CalcPrazo();
    }

    /**
     * Create an instance of {@link CalcPrecoPrazoRestricaoResponse }
     * 
     */
    public CalcPrecoPrazoRestricaoResponse createCalcPrecoPrazoRestricaoResponse() {
        return new CalcPrecoPrazoRestricaoResponse();
    }

    /**
     * Create an instance of {@link CalcPrazoRestricaoResponse }
     * 
     */
    public CalcPrazoRestricaoResponse createCalcPrazoRestricaoResponse() {
        return new CalcPrazoRestricaoResponse();
    }

    /**
     * Create an instance of {@link CalcPrazoDataResponse }
     * 
     */
    public CalcPrazoDataResponse createCalcPrazoDataResponse() {
        return new CalcPrazoDataResponse();
    }

    /**
     * Create an instance of {@link CalcPrazoObjeto }
     * 
     */
    public CalcPrazoObjeto createCalcPrazoObjeto() {
        return new CalcPrazoObjeto();
    }

    /**
     * Create an instance of {@link CalcPrecoPrazo }
     * 
     */
    public CalcPrecoPrazo createCalcPrecoPrazo() {
        return new CalcPrecoPrazo();
    }

    /**
     * Create an instance of {@link CalcPrecoPrazoDataResponse }
     * 
     */
    public CalcPrecoPrazoDataResponse createCalcPrecoPrazoDataResponse() {
        return new CalcPrecoPrazoDataResponse();
    }

    /**
     * Create an instance of {@link CObjeto }
     * 
     */
    public CObjeto createCObjeto() {
        return new CObjeto();
    }

    /**
     * Create an instance of {@link ArrayOfCServico }
     * 
     */
    public ArrayOfCServico createArrayOfCServico() {
        return new ArrayOfCServico();
    }

    /**
     * Create an instance of {@link CServico }
     * 
     */
    public CServico createCServico() {
        return new CServico();
    }

    /**
     * Create an instance of {@link ArrayOfCObjeto }
     * 
     */
    public ArrayOfCObjeto createArrayOfCObjeto() {
        return new ArrayOfCObjeto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CResultado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cResultado")
    public JAXBElement<CResultado> createCResultado(CResultado value) {
        return new JAXBElement<CResultado>(_CResultado_QNAME, CResultado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CResultadoObjeto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cResultadoObjeto")
    public JAXBElement<CResultadoObjeto> createCResultadoObjeto(CResultadoObjeto value) {
        return new JAXBElement<CResultadoObjeto>(_CResultadoObjeto_QNAME, CResultadoObjeto.class, null, value);
    }

}
