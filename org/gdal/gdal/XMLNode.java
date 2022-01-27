package org.gdal.gdal;

public class XMLNode {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected XMLNode(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(XMLNode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdalJNI.delete_XMLNode(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(XMLNode obj) {
    if (obj != null)
    {
        obj.swigCMemOwn= false;
        obj.parentReference = null;
    }
    return getCPtr(obj);
  }

  /* Ensure that the GC doesn't collect any parent instance set from Java */
  protected void addReference(Object reference) {
    parentReference = reference;
  }

  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof XMLNode)
      equal = (((XMLNode)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public XMLNodeType getType() {
    return XMLNodeType.swigToEnum(gdalJNI.XMLNode_Type_get(swigCPtr, this));
  }

  public String getValue() {
    return gdalJNI.XMLNode_Value_get(swigCPtr, this);
  }

  public XMLNode getNext() {
    long cPtr = gdalJNI.XMLNode_Next_get(swigCPtr, this);
    return (cPtr == 0) ? null : new XMLNode(cPtr, false);
  }

  public XMLNode getChild() {
    long cPtr = gdalJNI.XMLNode_Child_get(swigCPtr, this);
    return (cPtr == 0) ? null : new XMLNode(cPtr, false);
  }

  public XMLNode(String pszString) {
    this(gdalJNI.new_XMLNode__SWIG_0(pszString), true);
  }

  public XMLNode(XMLNodeType eType, String pszText) {
    this(gdalJNI.new_XMLNode__SWIG_1(eType.swigValue(), pszText), true);
  }

  public static XMLNode ParseXMLFile(String pszFilename) {
    long cPtr = gdalJNI.XMLNode_ParseXMLFile(pszFilename);
    return (cPtr == 0) ? null : new XMLNode(cPtr, true);
  }

  public String SerializeXMLTree() {
    return gdalJNI.XMLNode_SerializeXMLTree(swigCPtr, this);
  }

  public String toString() {
    return gdalJNI.XMLNode_toString(swigCPtr, this);
  }

  public XMLNode SearchXMLNode(String pszElement) {
    long cPtr = gdalJNI.XMLNode_SearchXMLNode(swigCPtr, this, pszElement);
    XMLNode ret = null;
    if (cPtr != 0) {
      ret = new XMLNode(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public XMLNode GetXMLNode(String pszPath) {
    long cPtr = gdalJNI.XMLNode_GetXMLNode(swigCPtr, this, pszPath);
    XMLNode ret = null;
    if (cPtr != 0) {
      ret = new XMLNode(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public String GetXMLValue(String pszPath, String pszDefault) {
    return gdalJNI.XMLNode_GetXMLValue(swigCPtr, this, pszPath, pszDefault);
  }

  public void AddXMLChild(XMLNode psChild) {
    gdalJNI.XMLNode_AddXMLChild(swigCPtr, this, XMLNode.getCPtr(psChild), psChild);
  }

  public void AddXMLSibling(XMLNode psNewSibling) {
    gdalJNI.XMLNode_AddXMLSibling(swigCPtr, this, XMLNode.getCPtr(psNewSibling), psNewSibling);
  }

  public XMLNode Clone() {
    long cPtr = gdalJNI.XMLNode_Clone(swigCPtr, this);
    return (cPtr == 0) ? null : new XMLNode(cPtr, true);
  }

  public int SetXMLValue(String pszPath, String pszValue) {
    return gdalJNI.XMLNode_SetXMLValue(swigCPtr, this, pszPath, pszValue);
  }

  public void StripXMLNamespace(String pszNamespace, int bRecurse) {
    gdalJNI.XMLNode_StripXMLNamespace(swigCPtr, this, pszNamespace, bRecurse);
  }

}
