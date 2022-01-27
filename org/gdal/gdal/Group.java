package org.gdal.gdal;

public class Group {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Group(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Group obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdalJNI.delete_Group(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(Group obj) {
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
    if (obj instanceof Group)
      equal = (((Group)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public String GetName() {
    return gdalJNI.Group_GetName(swigCPtr, this);
  }

  public String GetFullName() {
    return gdalJNI.Group_GetFullName(swigCPtr, this);
  }

  public java.util.Vector GetMDArrayNames(java.util.Vector options) {
    return gdalJNI.Group_GetMDArrayNames__SWIG_0(swigCPtr, this, options);
  }

  public java.util.Vector GetMDArrayNames() {
    return gdalJNI.Group_GetMDArrayNames__SWIG_1(swigCPtr, this);
  }

  public MDArray OpenMDArray(String name, java.util.Vector options) {
    long cPtr = gdalJNI.Group_OpenMDArray__SWIG_0(swigCPtr, this, name, options);
    return (cPtr == 0) ? null : new MDArray(cPtr, true);
  }

  public MDArray OpenMDArray(String name) {
    long cPtr = gdalJNI.Group_OpenMDArray__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new MDArray(cPtr, true);
  }

  public java.util.Vector GetGroupNames(java.util.Vector options) {
    return gdalJNI.Group_GetGroupNames__SWIG_0(swigCPtr, this, options);
  }

  public java.util.Vector GetGroupNames() {
    return gdalJNI.Group_GetGroupNames__SWIG_1(swigCPtr, this);
  }

  public Group OpenGroup(String name, java.util.Vector options) {
    long cPtr = gdalJNI.Group_OpenGroup__SWIG_0(swigCPtr, this, name, options);
    return (cPtr == 0) ? null : new Group(cPtr, true);
  }

  public Group OpenGroup(String name) {
    long cPtr = gdalJNI.Group_OpenGroup__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Group(cPtr, true);
  }

  public Attribute GetAttribute(String name) {
    long cPtr = gdalJNI.Group_GetAttribute(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Attribute(cPtr, true);
  }

  public java.util.Hashtable GetStructuralInfo() {
    return gdalJNI.Group_GetStructuralInfo(swigCPtr, this);
  }

  public Group CreateGroup(String name, java.util.Vector options) {
    long cPtr = gdalJNI.Group_CreateGroup__SWIG_0(swigCPtr, this, name, options);
    return (cPtr == 0) ? null : new Group(cPtr, true);
  }

  public Group CreateGroup(String name) {
    long cPtr = gdalJNI.Group_CreateGroup__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Group(cPtr, true);
  }

  public Dimension CreateDimension(String name, String type, String direction, java.math.BigInteger size, java.util.Vector options) {
    long cPtr = gdalJNI.Group_CreateDimension__SWIG_0(swigCPtr, this, name, type, direction, size, options);
    return (cPtr == 0) ? null : new Dimension(cPtr, true);
  }

  public Dimension CreateDimension(String name, String type, String direction, java.math.BigInteger size) {
    long cPtr = gdalJNI.Group_CreateDimension__SWIG_1(swigCPtr, this, name, type, direction, size);
    return (cPtr == 0) ? null : new Dimension(cPtr, true);
  }

  public Attribute CreateAttribute(String name, int nDimensions, SWIGTYPE_p_GUIntBig dimensions, ExtendedDataType data_type, java.util.Vector options) {
    long cPtr = gdalJNI.Group_CreateAttribute__SWIG_0(swigCPtr, this, name, nDimensions, SWIGTYPE_p_GUIntBig.getCPtr(dimensions), ExtendedDataType.getCPtr(data_type), data_type, options);
    return (cPtr == 0) ? null : new Attribute(cPtr, true);
  }

  public Attribute CreateAttribute(String name, int nDimensions, SWIGTYPE_p_GUIntBig dimensions, ExtendedDataType data_type) {
    long cPtr = gdalJNI.Group_CreateAttribute__SWIG_1(swigCPtr, this, name, nDimensions, SWIGTYPE_p_GUIntBig.getCPtr(dimensions), ExtendedDataType.getCPtr(data_type), data_type);
    return (cPtr == 0) ? null : new Attribute(cPtr, true);
  }

}
