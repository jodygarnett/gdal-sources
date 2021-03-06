package org.gdal.osr;

public class CoordinateTransformation {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CoordinateTransformation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CoordinateTransformation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        osrJNI.delete_CoordinateTransformation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public double[] TransformPoint(double x, double y, double z) {
    double[] ret = new double[3];
    TransformPoint(ret, x, y, z);
    return ret;
  }

  public double[] TransformPoint(double x, double y) {
    return TransformPoint(x, y, 0);
  }

  /* New in GDAL 1.10 */
  public static CoordinateTransformation CreateCoordinateTransformation(SpatialReference src, SpatialReference dst)
  {
      CoordinateTransformation ct = osr.CreateCoordinateTransformation(src, dst);
      if( ct == null && osr.GetUseExceptions() )
        throw new RuntimeException("Cannot create CoordinateTransformation: " + org.gdal.gdal.gdal.GetLastErrorMsg());
      return ct;
  }

  public static CoordinateTransformation CreateCoordinateTransformation(SpatialReference src, SpatialReference dst, CoordinateTransformationOptions options)
  {
      CoordinateTransformation ct = osr.CreateCoordinateTransformation(src, dst, options);
      if( ct == null && osr.GetUseExceptions() )
        throw new RuntimeException("Cannot create CoordinateTransformation: " + org.gdal.gdal.gdal.GetLastErrorMsg());
      return ct;
  }

  public CoordinateTransformation(SpatialReference src, SpatialReference dst) {
    this(osrJNI.new_CoordinateTransformation__SWIG_0(SpatialReference.getCPtr(src), src, SpatialReference.getCPtr(dst), dst), true);
  }

  public CoordinateTransformation(SpatialReference src, SpatialReference dst, CoordinateTransformationOptions options) {
    this(osrJNI.new_CoordinateTransformation__SWIG_1(SpatialReference.getCPtr(src), src, SpatialReference.getCPtr(dst), dst, CoordinateTransformationOptions.getCPtr(options), options), true);
  }

  public void TransformPoint(double[] inout) {
    osrJNI.CoordinateTransformation_TransformPoint__SWIG_0(swigCPtr, this, inout);
  }

  public void TransformPoint(double[] argout, double x, double y, double z) {
    osrJNI.CoordinateTransformation_TransformPoint__SWIG_2(swigCPtr, this, argout, x, y, z);
  }

  public void TransformPoint(double[] argout, double x, double y) {
    osrJNI.CoordinateTransformation_TransformPoint__SWIG_3(swigCPtr, this, argout, x, y);
  }

  public void TransformPoint(double[] argout, double x, double y, double z, double t) {
    osrJNI.CoordinateTransformation_TransformPoint__SWIG_4(swigCPtr, this, argout, x, y, z, t);
  }

  public int TransformPointWithErrorCode(double[] argout, double x, double y, double z, double t) {
    return osrJNI.CoordinateTransformation_TransformPointWithErrorCode(swigCPtr, this, argout, x, y, z, t);
  }

  public void TransformPoints(double[][] nCount) {
    osrJNI.CoordinateTransformation_TransformPoints(swigCPtr, this, nCount);
  }

  public int[] TransformPointsWithErrorCodes(double[][] nCount) {
    return osrJNI.CoordinateTransformation_TransformPointsWithErrorCodes(swigCPtr, this, nCount);
  }

  public void TransformBounds(double[] argout, double minx, double miny, double maxx, double maxy, int densify_pts) {
    osrJNI.CoordinateTransformation_TransformBounds(swigCPtr, this, argout, minx, miny, maxx, maxy, densify_pts);
  }

}
