package org.gdal.ogr;

import org.gdal.osr.CoordinateTransformation;

public class GeomTransformer {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GeomTransformer(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GeomTransformer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ogrJNI.delete_GeomTransformer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  private Object parentReference;

  protected static long getCPtrAndDisown(GeomTransformer obj) {
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
    if (obj instanceof GeomTransformer)
      equal = (((GeomTransformer)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }


  public GeomTransformer(CoordinateTransformation ct, java.util.Vector options) {
    this(ogrJNI.new_GeomTransformer__SWIG_0(CoordinateTransformation.getCPtr(ct), ct, options), true);
  }

  public GeomTransformer(CoordinateTransformation ct) {
    this(ogrJNI.new_GeomTransformer__SWIG_1(CoordinateTransformation.getCPtr(ct), ct), true);
  }

  public Geometry Transform(Geometry src_geom) {
    long cPtr = ogrJNI.GeomTransformer_Transform(swigCPtr, this, Geometry.getCPtr(src_geom), src_geom);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

}
