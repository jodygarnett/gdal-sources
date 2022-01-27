package org.gdal.gdal;

public class Transformer {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Transformer(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Transformer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdalJNI.delete_Transformer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(Transformer obj) {
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
    if (obj instanceof Transformer)
      equal = (((Transformer)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public Transformer(Dataset src, Dataset dst, java.util.Vector options) {
    this(gdalJNI.new_Transformer(Dataset.getCPtr(src), src, Dataset.getCPtr(dst), dst, options), true);
  }

  public int TransformPoint(int bDstToSrc, double[] inout) {
    return gdalJNI.Transformer_TransformPoint__SWIG_0(swigCPtr, this, bDstToSrc, inout);
  }

  public int TransformPoint(double[] argout, int bDstToSrc, double x, double y, double z) {
    return gdalJNI.Transformer_TransformPoint__SWIG_1(swigCPtr, this, argout, bDstToSrc, x, y, z);
  }

  public int TransformPoint(double[] argout, int bDstToSrc, double x, double y) {
    return gdalJNI.Transformer_TransformPoint__SWIG_2(swigCPtr, this, argout, bDstToSrc, x, y);
  }

  public int TransformPoints(int bDstToSrc, double[][] nCount, int[] panSuccess) {
    return gdalJNI.Transformer_TransformPoints(swigCPtr, this, bDstToSrc, nCount, panSuccess);
  }

  public int TransformGeolocations(Band xBand, Band yBand, Band zBand, ProgressCallback callback, java.util.Vector options) {
    return gdalJNI.Transformer_TransformGeolocations__SWIG_0(swigCPtr, this, Band.getCPtr(xBand), xBand, Band.getCPtr(yBand), yBand, Band.getCPtr(zBand), zBand, callback, options);
  }

  public int TransformGeolocations(Band xBand, Band yBand, Band zBand, ProgressCallback callback) {
    return gdalJNI.Transformer_TransformGeolocations__SWIG_1(swigCPtr, this, Band.getCPtr(xBand), xBand, Band.getCPtr(yBand), yBand, Band.getCPtr(zBand), zBand, callback);
  }

  public int TransformGeolocations(Band xBand, Band yBand, Band zBand) {
    return gdalJNI.Transformer_TransformGeolocations__SWIG_3(swigCPtr, this, Band.getCPtr(xBand), xBand, Band.getCPtr(yBand), yBand, Band.getCPtr(zBand), zBand);
  }

}
