//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.common.jaxb.ac.impl;

public class KeyActivationTypeImpl implements com.sun.identity.liberty.ws.common.jaxb.ac.KeyActivationType, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Extension;
    protected com.sun.identity.liberty.ws.common.jaxb.ac.ActivationPinType _ActivationPin;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.ac.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.common.jaxb.ac.KeyActivationType.class);
    }

    protected com.sun.xml.bind.util.ListImpl _getExtension() {
        if (_Extension == null) {
            _Extension = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Extension;
    }

    public java.util.List getExtension() {
        return _getExtension();
    }

    public com.sun.identity.liberty.ws.common.jaxb.ac.ActivationPinType getActivationPin() {
        return _ActivationPin;
    }

    public void setActivationPin(com.sun.identity.liberty.ws.common.jaxb.ac.ActivationPinType value) {
        _ActivationPin = value;
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.common.jaxb.ac.impl.KeyActivationTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Extension == null)? 0 :_Extension.size());
        if ((_ActivationPin!= null)&&(((_Extension == null)? 0 :_Extension.size()) == 0)) {
            if (_ActivationPin instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _ActivationPin), "ActivationPin");
            } else {
                context.startElement("urn:liberty:ac:2003-08", "ActivationPin");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _ActivationPin), "ActivationPin");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _ActivationPin), "ActivationPin");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _ActivationPin), "ActivationPin");
                context.endElement();
            }
        } else {
            if ((_ActivationPin == null)&&(((_Extension == null)? 0 :_Extension.size())>= 1)) {
                while (idx1 != len1) {
                    if (_Extension.get(idx1) instanceof javax.xml.bind.Element) {
                        context.childAsBody(((com.sun.xml.bind.JAXBObject) _Extension.get(idx1 ++)), "Extension");
                    } else {
                        context.startElement("urn:liberty:ac:2003-08", "Extension");
                        int idx_2 = idx1;
                        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Extension.get(idx_2 ++)), "Extension");
                        context.endNamespaceDecls();
                        int idx_3 = idx1;
                        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Extension.get(idx_3 ++)), "Extension");
                        context.endAttributes();
                        context.childAsBody(((com.sun.xml.bind.JAXBObject) _Extension.get(idx1 ++)), "Extension");
                        context.endElement();
                    }
                }
            }
        }
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Extension == null)? 0 :_Extension.size());
        if ((_ActivationPin!= null)&&(((_Extension == null)? 0 :_Extension.size()) == 0)) {
            if (_ActivationPin instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _ActivationPin), "ActivationPin");
            }
        } else {
            if ((_ActivationPin == null)&&(((_Extension == null)? 0 :_Extension.size())>= 1)) {
                while (idx1 != len1) {
                    if (_Extension.get(idx1) instanceof javax.xml.bind.Element) {
                        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Extension.get(idx1 ++)), "Extension");
                    } else {
                        idx1 += 1;
                    }
                }
            }
        }
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Extension == null)? 0 :_Extension.size());
        if ((_ActivationPin!= null)&&(((_Extension == null)? 0 :_Extension.size()) == 0)) {
            if (_ActivationPin instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _ActivationPin), "ActivationPin");
            }
        } else {
            if ((_ActivationPin == null)&&(((_Extension == null)? 0 :_Extension.size())>= 1)) {
                while (idx1 != len1) {
                    if (_Extension.get(idx1) instanceof javax.xml.bind.Element) {
                        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Extension.get(idx1 ++)), "Extension");
                    } else {
                        idx1 += 1;
                    }
                }
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.common.jaxb.ac.KeyActivationType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gramm"
+"ar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expression"
+"\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bex"
+"pandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsr\u0000\'com.sun.msv.grammar.trex.Eleme"
+"ntPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/Name"
+"Class;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignore"
+"UndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\u0000ppsr\u0000"
+" com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv."
+"grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Bo"
+"olean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.Attribut"
+"eExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\bxq\u0000~\u0000\u0003q\u0000~\u0000\u0010psr\u00002c"
+"om.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xq\u0000~\u0000\u0003sq\u0000~\u0000\u000f\u0001q\u0000~\u0000\u0014sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.s"
+"un.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003"
+"q\u0000~\u0000\u0015q\u0000~\u0000\u001asr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002"
+"L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001cxq\u0000~\u0000\u0017t"
+"\u0000?com.sun.identity.liberty.ws.common.jaxb.ac.ActivationPinEl"
+"ementt\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0007pp\u0000"
+"sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\u0007"
+"pp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\u0011q\u0000~\u0000\u0010pq\u0000~\u0000\u0014q\u0000~\u0000\u0018q\u0000~\u0000\u001asq\u0000~\u0000\u001bt\u0000<c"
+"om.sun.identity.liberty.ws.common.jaxb.ac.ActivationPinTypeq"
+"\u0000~\u0000\u001fsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0011q\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L"
+"\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003q\u0000~\u0000\u0010psr\u0000\"com.su"
+"n.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datat"
+"ype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype"
+".xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSD"
+"atatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\u001cL\u0000\btypeNameq\u0000~\u0000\u001cL\u0000"
+"\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;"
+"xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv"
+".datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com"
+".sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000co"
+"m.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000"
+"~\u0000\u0003q\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalN"
+"ameq\u0000~\u0000\u001cL\u0000\fnamespaceURIq\u0000~\u0000\u001cxpq\u0000~\u00006q\u0000~\u00005sq\u0000~\u0000\u001bt\u0000\u0004typet\u0000)http"
+"://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001asq\u0000~\u0000\u001bt\u0000\rActivatio"
+"nPint\u0000\u0016urn:liberty:ac:2003-08sq\u0000~\u0000\fppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0007pp\u0000sq\u0000~\u0000\u0000"
+"ppsq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\u0011q\u0000~\u0000\u0010pq\u0000~\u0000\u0014q\u0000~\u0000\u0018q\u0000~\u0000\u001asq\u0000~\u0000\u001bt\u0000;com.sun.id"
+"entity.liberty.ws.common.jaxb.ac.ExtensionElementq\u0000~\u0000\u001fsq\u0000~\u0000\u0007"
+"pp\u0000sq\u0000~\u0000!ppsq\u0000~\u0000\u0007pp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\u0011q\u0000~\u0000\u0010pq\u0000~\u0000\u0014q\u0000~"
+"\u0000\u0018q\u0000~\u0000\u001asq\u0000~\u0000\u001bt\u00008com.sun.identity.liberty.ws.common.jaxb.ac.E"
+"xtensionTypeq\u0000~\u0000\u001fsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0011q\u0000~\u0000\u0010pq\u0000~\u0000.q\u0000~\u0000>q\u0000~\u0000\u001asq\u0000~\u0000\u001bt\u0000"
+"\tExtensionq\u0000~\u0000Csr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Closed"
+"Hash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N"
+"\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/gram"
+"mar/ExpressionPool;xp\u0000\u0000\u0000\u0010\u0001pq\u0000~\u0000Eq\u0000~\u0000Dq\u0000~\u0000\u000eq\u0000~\u0000%q\u0000~\u0000Hq\u0000~\u0000Pq\u0000~"
+"\u0000\u000bq\u0000~\u0000$q\u0000~\u0000Gq\u0000~\u0000Oq\u0000~\u0000\"q\u0000~\u0000Mq\u0000~\u0000)q\u0000~\u0000Tq\u0000~\u0000\u0005q\u0000~\u0000\u0006x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "------");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.common.jaxb.ac.impl.KeyActivationTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        if (("Length" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _ActivationPin = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Length" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _ActivationPin = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Alphabet" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _ActivationPin = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Alphabet" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _ActivationPin = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Generation" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _ActivationPin = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Generation" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _ActivationPin = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ActivationLimit" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _ActivationPin = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ActivationLimit" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _ActivationPin = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _ActivationPin = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _ActivationPin = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _ActivationPin = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  3 :
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _getExtension().add(((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionElementImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (!(("" == ___uri)||("urn:liberty:ac:2003-08" == ___uri))) {
                            _getExtension().add(((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionTypeImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        break;
                    case  0 :
                        if (("ActivationPin" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _ActivationPin = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinElementImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ActivationPin" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 4;
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _getExtension().add(((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionElementImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  4 :
                        _ActivationPin = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl) spawnChildFromLeaveElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl.class), 5, ___uri, ___local, ___qname));
                        return ;
                    case  5 :
                        if (("ActivationPin" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        _ActivationPin = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl.class), 5, ___uri, ___local, ___qname));
                        return ;
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        _ActivationPin = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl) spawnChildFromLeaveAttribute((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl.class), 5, ___uri, ___local, ___qname));
                        return ;
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  4 :
                            _ActivationPin = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl) spawnChildFromText((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ActivationPinTypeImpl.class), 5, value));
                            return ;
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
