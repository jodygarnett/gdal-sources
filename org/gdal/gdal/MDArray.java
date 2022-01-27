package org.gdal.gdal;

import org.gdal.osr.SpatialReference;

public class MDArray {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MDArray(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MDArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdalJNI.delete_MDArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(MDArray obj) {
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
    if (obj instanceof MDArray)
      equal = (((MDArray)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public String GetName() {
    return gdalJNI.MDArray_GetName(swigCPtr, this);
  }

  public String GetFullName() {
    return gdalJNI.MDArray_GetFullName(swigCPtr, this);
  }

  public java.math.BigInteger GetTotalElementsCount() {
    return gdalJNI.MDArray_GetTotalElementsCount(swigCPtr, this);
  }

  public long GetDimensionCount() {
    return gdalJNI.MDArray_GetDimensionCount(swigCPtr, this);
  }

  public ExtendedDataType GetDataType() {
    long cPtr = gdalJNI.MDArray_GetDataType(swigCPtr, this);
    return (cPtr == 0) ? null : new ExtendedDataType(cPtr, true);
  }

  public java.util.Hashtable GetStructuralInfo() {
    return gdalJNI.MDArray_GetStructuralInfo(swigCPtr, this);
  }

  public Attribute GetAttribute(String name) {
    long cPtr = gdalJNI.MDArray_GetAttribute(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Attribute(cPtr, true);
  }

  public Attribute CreateAttribute(String name, int nDimensions, SWIGTYPE_p_GUIntBig dimensions, ExtendedDataType data_type, java.util.Vector options) {
    long cPtr = gdalJNI.MDArray_CreateAttribute__SWIG_0(swigCPtr, this, name, nDimensions, SWIGTYPE_p_GUIntBig.getCPtr(dimensions), ExtendedDataType.getCPtr(data_type), data_type, options);
    return (cPtr == 0) ? null : new Attribute(cPtr, true);
  }

  public Attribute CreateAttribute(String name, int nDimensions, SWIGTYPE_p_GUIntBig dimensions, ExtendedDataType data_type) {
    long cPtr = gdalJNI.MDArray_CreateAttribute__SWIG_1(swigCPtr, this, name, nDimensions, SWIGTYPE_p_GUIntBig.getCPtr(dimensions), ExtendedDataType.getCPtr(data_type), data_type);
    return (cPtr == 0) ? null : new Attribute(cPtr, true);
  }

  public void GetNoDataValueAsDouble(Double[] val) {
    gdalJNI.MDArray_GetNoDataValueAsDouble(swigCPtr, this, val);
  }

  public int SetNoDataValueDouble(double d) {
    return gdalJNI.MDArray_SetNoDataValueDouble(swigCPtr, this, d);
  }

  public int DeleteNoDataValue() {
    return gdalJNI.MDArray_DeleteNoDataValue(swigCPtr, this);
  }

  public void GetOffset(Double[] val) {
    gdalJNI.MDArray_GetOffset(swigCPtr, this, val);
  }

  public void GetScale(Double[] val) {
    gdalJNI.MDArray_GetScale(swigCPtr, this, val);
  }

  public int SetOffset(double val) {
    return gdalJNI.MDArray_SetOffset(swigCPtr, this, val);
  }

  public int SetScale(double val) {
    return gdalJNI.MDArray_SetScale(swigCPtr, this, val);
  }

  public int SetUnit(String unit) {
    return gdalJNI.MDArray_SetUnit(swigCPtr, this, unit);
  }

  public String GetUnit() {
    return gdalJNI.MDArray_GetUnit(swigCPtr, this);
  }

  public int SetSpatialRef(SpatialReference srs) {
    return gdalJNI.MDArray_SetSpatialRef(swigCPtr, this, SpatialReference.getCPtr(srs), srs);
  }

  public SpatialReference GetSpatialRef() {
    long cPtr = gdalJNI.MDArray_GetSpatialRef(swigCPtr, this);
    return (cPtr == 0) ? null : new SpatialReference(cPtr, true);
  }

  public MDArray GetView(String viewExpr) {
    long cPtr = gdalJNI.MDArray_GetView(swigCPtr, this, viewExpr);
    return (cPtr == 0) ? null : new MDArray(cPtr, true);
  }

  public MDArray Transpose(int[] nList) {
    long cPtr = gdalJNI.MDArray_Transpose(swigCPtr, this, nList);
    return (cPtr == 0) ? null : new MDArray(cPtr, true);
  }

  public MDArray GetUnscaled() {
    long cPtr = gdalJNI.MDArray_GetUnscaled(swigCPtr, this);
    return (cPtr == 0) ? null : new MDArray(cPtr, true);
  }

  public MDArray GetMask(java.util.Vector options) {
    long cPtr = gdalJNI.MDArray_GetMask__SWIG_0(swigCPtr, this, options);
    return (cPtr == 0) ? null : new MDArray(cPtr, true);
  }

  public MDArray GetMask() {
    long cPtr = gdalJNI.MDArray_GetMask__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new MDArray(cPtr, true);
  }

  public Dataset AsClassicDataset(long iXDim, long iYDim) {
    long cPtr = gdalJNI.MDArray_AsClassicDataset(swigCPtr, this, iXDim, iYDim);
    return (cPtr == 0) ? null : new Dataset(cPtr, true);
  }

}
