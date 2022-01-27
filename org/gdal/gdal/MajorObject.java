package org.gdal.gdal;

public class MajorObject {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MajorObject(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MajorObject obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  /* Ensure that the GC doesn't collect any parent instance set from Java */
  protected void addReference(Object reference) {
    parentReference = reference;
  }

  /* For backward compatibility */
  public int SetMetadata(java.util.Hashtable metadata, String domain)
  {
      if (metadata == null)
          return SetMetadata((java.util.Vector)null, domain);
      java.util.Vector v = new java.util.Vector();
      java.util.Enumeration values = metadata.elements();
      java.util.Enumeration keys = metadata.keys();
      while(keys.hasMoreElements())
      {
          v.add((String)keys.nextElement() + "=" + (String)values.nextElement());
      }
      return SetMetadata(v, domain);
  }

  public int SetMetadata(java.util.Hashtable metadata)
  {
      return SetMetadata(metadata, null);
  }

  public String GetDescription() {
    return gdalJNI.MajorObject_GetDescription(swigCPtr, this);
  }

  public void SetDescription(String pszNewDesc) {
    gdalJNI.MajorObject_SetDescription(swigCPtr, this, pszNewDesc);
  }

  public java.util.Vector GetMetadataDomainList() {
    return gdalJNI.MajorObject_GetMetadataDomainList(swigCPtr, this);
  }

  public java.util.Hashtable GetMetadata_Dict(String pszDomain) {
    return gdalJNI.MajorObject_GetMetadata_Dict__SWIG_0(swigCPtr, this, pszDomain);
  }

  public java.util.Hashtable GetMetadata_Dict() {
    return gdalJNI.MajorObject_GetMetadata_Dict__SWIG_1(swigCPtr, this);
  }

  public java.util.Vector GetMetadata_List(String pszDomain) {
    return gdalJNI.MajorObject_GetMetadata_List__SWIG_0(swigCPtr, this, pszDomain);
  }

  public java.util.Vector GetMetadata_List() {
    return gdalJNI.MajorObject_GetMetadata_List__SWIG_1(swigCPtr, this);
  }

  public int SetMetadata(java.util.Vector papszMetadata, String pszDomain) {
    return gdalJNI.MajorObject_SetMetadata__SWIG_0(swigCPtr, this, papszMetadata, pszDomain);
  }

  public int SetMetadata(java.util.Vector papszMetadata) {
    return gdalJNI.MajorObject_SetMetadata__SWIG_1(swigCPtr, this, papszMetadata);
  }

  public int SetMetadata(String pszMetadataString, String pszDomain) {
    return gdalJNI.MajorObject_SetMetadata__SWIG_2(swigCPtr, this, pszMetadataString, pszDomain);
  }

  public int SetMetadata(String pszMetadataString) {
    return gdalJNI.MajorObject_SetMetadata__SWIG_3(swigCPtr, this, pszMetadataString);
  }

  public String GetMetadataItem(String pszName, String pszDomain) {
    return gdalJNI.MajorObject_GetMetadataItem__SWIG_0(swigCPtr, this, pszName, pszDomain);
  }

  public String GetMetadataItem(String pszName) {
    return gdalJNI.MajorObject_GetMetadataItem__SWIG_1(swigCPtr, this, pszName);
  }

  public int SetMetadataItem(String pszName, String pszValue, String pszDomain) {
    return gdalJNI.MajorObject_SetMetadataItem__SWIG_0(swigCPtr, this, pszName, pszValue, pszDomain);
  }

  public int SetMetadataItem(String pszName, String pszValue) {
    return gdalJNI.MajorObject_SetMetadataItem__SWIG_1(swigCPtr, this, pszName, pszValue);
  }

}
