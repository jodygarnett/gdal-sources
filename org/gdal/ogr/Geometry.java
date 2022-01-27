package org.gdal.ogr;

import org.gdal.ogr.ogr;
import org.gdal.ogr.GeometryNative;
import org.gdal.osr.SpatialReference;
import org.gdal.osr.CoordinateTransformation;

public class Geometry implements Cloneable {
  private long swigCPtr;
  private GeometryNative nativeObject;

  public Geometry(long cPtr, boolean cMemoryOwn) {
    if (cPtr == 0)
        throw new RuntimeException();
    swigCPtr = cPtr;
    if (cMemoryOwn)
        nativeObject = new GeometryNative(this, cPtr);
  }

  public static long getCPtr(Geometry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public void delete() 
   {
      if (nativeObject != null)
      {
        nativeObject.delete();
        nativeObject = null;
      }
   }


  private Object parentReference;

  protected static long getCPtrAndDisown(Geometry obj) {
    if (obj != null)
    {
        if (obj.nativeObject == null)
            throw new RuntimeException("Cannot disown an object that was not owned...");
        obj.nativeObject.dontDisposeNativeResources();
        obj.nativeObject = null;
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
    if (obj instanceof Geometry)
      equal = Equal((Geometry)obj);
    return equal;
  }

  public int hashCode() {
     return (int)swigCPtr;
  }

  public Object clone()
  {
      return Clone();
  }

  public double[] GetPoint_2D(int iPoint)
  {
      double[] coords = new double[2];
      GetPoint_2D(iPoint, coords);
      return coords;
  }

  public double[] GetPoint(int iPoint)
  {
      double[] coords = new double[3];
      GetPoint(iPoint, coords);
      return coords;
  }

  public static Geometry CreateFromWkt(String wkt)
  {
      return ogr.CreateGeometryFromWkt(wkt);
  }

  public static Geometry CreateFromWkb(byte[] wkb)
  {
      return ogr.CreateGeometryFromWkb(wkb);
  }

  public static Geometry CreateFromGML(String gml)
  {
      return ogr.CreateGeometryFromGML(gml);
  }

  public static Geometry CreateFromJson(String json)
  {
      return ogr.CreateGeometryFromJson(json);
  }

  public int ExportToWkb(byte[] wkbArray, int byte_order)
  {
      if (wkbArray == null)
          throw new NullPointerException();
      byte[] srcArray = ExportToWkb(byte_order);
      if (wkbArray.length < srcArray.length)
          throw new RuntimeException("Array too small");

      System.arraycopy( srcArray, 0, wkbArray, 0, srcArray.length );

      return 0;
  }


  public int ExportToWkt(String[] argout) {
    return ogrJNI.Geometry_ExportToWkt__SWIG_0(swigCPtr, this, argout);
  }

  public int ExportToIsoWkt(String[] argout) {
    return ogrJNI.Geometry_ExportToIsoWkt(swigCPtr, this, argout);
  }

  public byte[] ExportToWkb(int byte_order) {
    return ogrJNI.Geometry_ExportToWkb__SWIG_0(swigCPtr, this, byte_order);
  }

  public byte[] ExportToWkb() {
    return ogrJNI.Geometry_ExportToWkb__SWIG_1(swigCPtr, this);
  }

  public byte[] ExportToIsoWkb(int byte_order) {
    return ogrJNI.Geometry_ExportToIsoWkb__SWIG_0(swigCPtr, this, byte_order);
  }

  public byte[] ExportToIsoWkb() {
    return ogrJNI.Geometry_ExportToIsoWkb__SWIG_1(swigCPtr, this);
  }

  public String ExportToGML(java.util.Vector options) {
    return ogrJNI.Geometry_ExportToGML__SWIG_0(swigCPtr, this, options);
  }

  public String ExportToGML() {
    return ogrJNI.Geometry_ExportToGML__SWIG_1(swigCPtr, this);
  }

  public String ExportToKML(String altitude_mode) {
    return ogrJNI.Geometry_ExportToKML__SWIG_0(swigCPtr, this, altitude_mode);
  }

  public String ExportToKML() {
    return ogrJNI.Geometry_ExportToKML__SWIG_1(swigCPtr, this);
  }

  public String ExportToJson(java.util.Vector options) {
    return ogrJNI.Geometry_ExportToJson__SWIG_0(swigCPtr, this, options);
  }

  public String ExportToJson() {
    return ogrJNI.Geometry_ExportToJson__SWIG_1(swigCPtr, this);
  }

  public void AddPoint(double x, double y, double z) {
    ogrJNI.Geometry_AddPoint__SWIG_0(swigCPtr, this, x, y, z);
  }

  public void AddPoint(double x, double y) {
    ogrJNI.Geometry_AddPoint__SWIG_1(swigCPtr, this, x, y);
  }

  public void AddPointM(double x, double y, double m) {
    ogrJNI.Geometry_AddPointM(swigCPtr, this, x, y, m);
  }

  public void AddPointZM(double x, double y, double z, double m) {
    ogrJNI.Geometry_AddPointZM(swigCPtr, this, x, y, z, m);
  }

  public void AddPoint_2D(double x, double y) {
    ogrJNI.Geometry_AddPoint_2D(swigCPtr, this, x, y);
  }

  public int AddGeometryDirectly(Geometry other_disown) {
    int ret = ogrJNI.Geometry_AddGeometryDirectly(swigCPtr, this, Geometry.getCPtrAndDisown(other_disown), other_disown);
    if (other_disown != null)
        other_disown.addReference(this);
    return ret;
  }

  public int AddGeometry(Geometry other) {
    return ogrJNI.Geometry_AddGeometry(swigCPtr, this, Geometry.getCPtr(other), other);
  }

  public int RemoveGeometry(int iSubGeom) {
    return ogrJNI.Geometry_RemoveGeometry(swigCPtr, this, iSubGeom);
  }

  public Geometry Clone() {
    long cPtr = ogrJNI.Geometry_Clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public int GetGeometryType() {
    return ogrJNI.Geometry_GetGeometryType(swigCPtr, this);
  }

  public String GetGeometryName() {
    return ogrJNI.Geometry_GetGeometryName(swigCPtr, this);
  }

  public double Length() {
    return ogrJNI.Geometry_Length(swigCPtr, this);
  }

  public double Area() {
    return ogrJNI.Geometry_Area(swigCPtr, this);
  }

  public double GetArea() {
    return ogrJNI.Geometry_GetArea(swigCPtr, this);
  }

  public int GetPointCount() {
    return ogrJNI.Geometry_GetPointCount(swigCPtr, this);
  }

  public double[][] GetPoints(int nCoordDimension) {
    return ogrJNI.Geometry_GetPoints__SWIG_0(swigCPtr, this, nCoordDimension);
  }

  public double[][] GetPoints() {
    return ogrJNI.Geometry_GetPoints__SWIG_1(swigCPtr, this);
  }

  public double GetX(int point) {
    return ogrJNI.Geometry_GetX__SWIG_0(swigCPtr, this, point);
  }

  public double GetX() {
    return ogrJNI.Geometry_GetX__SWIG_1(swigCPtr, this);
  }

  public double GetY(int point) {
    return ogrJNI.Geometry_GetY__SWIG_0(swigCPtr, this, point);
  }

  public double GetY() {
    return ogrJNI.Geometry_GetY__SWIG_1(swigCPtr, this);
  }

  public double GetZ(int point) {
    return ogrJNI.Geometry_GetZ__SWIG_0(swigCPtr, this, point);
  }

  public double GetZ() {
    return ogrJNI.Geometry_GetZ__SWIG_1(swigCPtr, this);
  }

  public double GetM(int point) {
    return ogrJNI.Geometry_GetM__SWIG_0(swigCPtr, this, point);
  }

  public double GetM() {
    return ogrJNI.Geometry_GetM__SWIG_1(swigCPtr, this);
  }

  public void GetPoint(int iPoint, double[] argout) {
    ogrJNI.Geometry_GetPoint(swigCPtr, this, iPoint, argout);
  }

  public void GetPointZM(int iPoint, double[] argout) {
    ogrJNI.Geometry_GetPointZM(swigCPtr, this, iPoint, argout);
  }

  public void GetPoint_2D(int iPoint, double[] argout) {
    ogrJNI.Geometry_GetPoint_2D(swigCPtr, this, iPoint, argout);
  }

  public int GetGeometryCount() {
    return ogrJNI.Geometry_GetGeometryCount(swigCPtr, this);
  }

  public void SetPoint(int point, double x, double y, double z) {
    ogrJNI.Geometry_SetPoint__SWIG_0(swigCPtr, this, point, x, y, z);
  }

  public void SetPoint(int point, double x, double y) {
    ogrJNI.Geometry_SetPoint__SWIG_1(swigCPtr, this, point, x, y);
  }

  public void SetPointM(int point, double x, double y, double m) {
    ogrJNI.Geometry_SetPointM(swigCPtr, this, point, x, y, m);
  }

  public void SetPointZM(int point, double x, double y, double z, double m) {
    ogrJNI.Geometry_SetPointZM(swigCPtr, this, point, x, y, z, m);
  }

  public void SetPoint_2D(int point, double x, double y) {
    ogrJNI.Geometry_SetPoint_2D(swigCPtr, this, point, x, y);
  }

  public void SwapXY() {
    ogrJNI.Geometry_SwapXY(swigCPtr, this);
  }

  public Geometry GetGeometryRef(int geom) {
    long cPtr = ogrJNI.Geometry_GetGeometryRef(swigCPtr, this, geom);
    Geometry ret = null;
    if (cPtr != 0) {
      ret = new Geometry(cPtr, false);
      ret.addReference(this);
    }
    return ret;
  }

  public Geometry Simplify(double tolerance) {
    long cPtr = ogrJNI.Geometry_Simplify(swigCPtr, this, tolerance);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry SimplifyPreserveTopology(double tolerance) {
    long cPtr = ogrJNI.Geometry_SimplifyPreserveTopology(swigCPtr, this, tolerance);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry DelaunayTriangulation(double dfTolerance, int bOnlyEdges) {
    long cPtr = ogrJNI.Geometry_DelaunayTriangulation__SWIG_0(swigCPtr, this, dfTolerance, bOnlyEdges);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry DelaunayTriangulation(double dfTolerance) {
    long cPtr = ogrJNI.Geometry_DelaunayTriangulation__SWIG_1(swigCPtr, this, dfTolerance);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry DelaunayTriangulation() {
    long cPtr = ogrJNI.Geometry_DelaunayTriangulation__SWIG_2(swigCPtr, this);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry Polygonize() {
    long cPtr = ogrJNI.Geometry_Polygonize(swigCPtr, this);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry Boundary() {
    long cPtr = ogrJNI.Geometry_Boundary(swigCPtr, this);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry GetBoundary() {
    long cPtr = ogrJNI.Geometry_GetBoundary(swigCPtr, this);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry ConvexHull() {
    long cPtr = ogrJNI.Geometry_ConvexHull(swigCPtr, this);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry MakeValid() {
    long cPtr = ogrJNI.Geometry_MakeValid(swigCPtr, this);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry Normalize() {
    long cPtr = ogrJNI.Geometry_Normalize(swigCPtr, this);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry RemoveLowerDimensionSubGeoms() {
    long cPtr = ogrJNI.Geometry_RemoveLowerDimensionSubGeoms(swigCPtr, this);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry Buffer(double distance, int quadsecs) {
    long cPtr = ogrJNI.Geometry_Buffer__SWIG_0(swigCPtr, this, distance, quadsecs);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry Buffer(double distance) {
    long cPtr = ogrJNI.Geometry_Buffer__SWIG_1(swigCPtr, this, distance);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry Intersection(Geometry other) {
    long cPtr = ogrJNI.Geometry_Intersection(swigCPtr, this, Geometry.getCPtr(other), other);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry Union(Geometry other) {
    long cPtr = ogrJNI.Geometry_Union(swigCPtr, this, Geometry.getCPtr(other), other);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry UnionCascaded() {
    long cPtr = ogrJNI.Geometry_UnionCascaded(swigCPtr, this);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry Difference(Geometry other) {
    long cPtr = ogrJNI.Geometry_Difference(swigCPtr, this, Geometry.getCPtr(other), other);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry SymDifference(Geometry other) {
    long cPtr = ogrJNI.Geometry_SymDifference(swigCPtr, this, Geometry.getCPtr(other), other);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry SymmetricDifference(Geometry other) {
    long cPtr = ogrJNI.Geometry_SymmetricDifference(swigCPtr, this, Geometry.getCPtr(other), other);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public double Distance(Geometry other) {
    return ogrJNI.Geometry_Distance(swigCPtr, this, Geometry.getCPtr(other), other);
  }

  public double Distance3D(Geometry other) {
    return ogrJNI.Geometry_Distance3D(swigCPtr, this, Geometry.getCPtr(other), other);
  }

  public void Empty() {
    ogrJNI.Geometry_Empty(swigCPtr, this);
  }

  public boolean IsEmpty() {
    return ogrJNI.Geometry_IsEmpty(swigCPtr, this);
  }

  public boolean IsValid() {
    return ogrJNI.Geometry_IsValid(swigCPtr, this);
  }

  public boolean IsSimple() {
    return ogrJNI.Geometry_IsSimple(swigCPtr, this);
  }

  public boolean IsRing() {
    return ogrJNI.Geometry_IsRing(swigCPtr, this);
  }

  public boolean Intersects(Geometry other) {
    return ogrJNI.Geometry_Intersects(swigCPtr, this, Geometry.getCPtr(other), other);
  }

  public boolean Intersect(Geometry other) {
    return ogrJNI.Geometry_Intersect(swigCPtr, this, Geometry.getCPtr(other), other);
  }

  public boolean Equals(Geometry other) {
    return ogrJNI.Geometry_Equals(swigCPtr, this, Geometry.getCPtr(other), other);
  }

  public boolean Equal(Geometry other) {
    return ogrJNI.Geometry_Equal(swigCPtr, this, Geometry.getCPtr(other), other);
  }

  public boolean Disjoint(Geometry other) {
    return ogrJNI.Geometry_Disjoint(swigCPtr, this, Geometry.getCPtr(other), other);
  }

  public boolean Touches(Geometry other) {
    return ogrJNI.Geometry_Touches(swigCPtr, this, Geometry.getCPtr(other), other);
  }

  public boolean Crosses(Geometry other) {
    return ogrJNI.Geometry_Crosses(swigCPtr, this, Geometry.getCPtr(other), other);
  }

  public boolean Within(Geometry other) {
    return ogrJNI.Geometry_Within(swigCPtr, this, Geometry.getCPtr(other), other);
  }

  public boolean Contains(Geometry other) {
    return ogrJNI.Geometry_Contains(swigCPtr, this, Geometry.getCPtr(other), other);
  }

  public boolean Overlaps(Geometry other) {
    return ogrJNI.Geometry_Overlaps(swigCPtr, this, Geometry.getCPtr(other), other);
  }

  public int TransformTo(SpatialReference reference) {
    return ogrJNI.Geometry_TransformTo(swigCPtr, this, SpatialReference.getCPtr(reference), reference);
  }

  public int Transform(CoordinateTransformation trans) {
    return ogrJNI.Geometry_Transform__SWIG_0(swigCPtr, this, CoordinateTransformation.getCPtr(trans), trans);
  }

  public SpatialReference GetSpatialReference() {
    long cPtr = ogrJNI.Geometry_GetSpatialReference(swigCPtr, this);
    return (cPtr == 0) ? null : new SpatialReference(cPtr, true);
  }

  public void AssignSpatialReference(SpatialReference reference) {
    ogrJNI.Geometry_AssignSpatialReference(swigCPtr, this, SpatialReference.getCPtr(reference), reference);
  }

  public void CloseRings() {
    ogrJNI.Geometry_CloseRings(swigCPtr, this);
  }

  public void FlattenTo2D() {
    ogrJNI.Geometry_FlattenTo2D(swigCPtr, this);
  }

  public void Segmentize(double dfMaxLength) {
    ogrJNI.Geometry_Segmentize(swigCPtr, this, dfMaxLength);
  }

  public void GetEnvelope(double[] argout) {
    ogrJNI.Geometry_GetEnvelope(swigCPtr, this, argout);
  }

  public void GetEnvelope3D(double[] argout) {
    ogrJNI.Geometry_GetEnvelope3D(swigCPtr, this, argout);
  }

  public Geometry Centroid() {
    long cPtr = ogrJNI.Geometry_Centroid(swigCPtr, this);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry PointOnSurface() {
    long cPtr = ogrJNI.Geometry_PointOnSurface(swigCPtr, this);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public long WkbSize() {
    return ogrJNI.Geometry_WkbSize(swigCPtr, this);
  }

  public int GetCoordinateDimension() {
    return ogrJNI.Geometry_GetCoordinateDimension(swigCPtr, this);
  }

  public int CoordinateDimension() {
    return ogrJNI.Geometry_CoordinateDimension(swigCPtr, this);
  }

  public int Is3D() {
    return ogrJNI.Geometry_Is3D(swigCPtr, this);
  }

  public int IsMeasured() {
    return ogrJNI.Geometry_IsMeasured(swigCPtr, this);
  }

  public void SetCoordinateDimension(int dimension) {
    ogrJNI.Geometry_SetCoordinateDimension(swigCPtr, this, dimension);
  }

  public void Set3D(int b3D) {
    ogrJNI.Geometry_Set3D(swigCPtr, this, b3D);
  }

  public void SetMeasured(int bMeasured) {
    ogrJNI.Geometry_SetMeasured(swigCPtr, this, bMeasured);
  }

  public int GetDimension() {
    return ogrJNI.Geometry_GetDimension(swigCPtr, this);
  }

  public int HasCurveGeometry(int bLookForCircular) {
    return ogrJNI.Geometry_HasCurveGeometry__SWIG_0(swigCPtr, this, bLookForCircular);
  }

  public int HasCurveGeometry() {
    return ogrJNI.Geometry_HasCurveGeometry__SWIG_1(swigCPtr, this);
  }

  public Geometry GetLinearGeometry(double dfMaxAngleStepSizeDegrees, java.util.Vector options) {
    long cPtr = ogrJNI.Geometry_GetLinearGeometry__SWIG_0(swigCPtr, this, dfMaxAngleStepSizeDegrees, options);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry GetLinearGeometry(double dfMaxAngleStepSizeDegrees) {
    long cPtr = ogrJNI.Geometry_GetLinearGeometry__SWIG_1(swigCPtr, this, dfMaxAngleStepSizeDegrees);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry GetLinearGeometry() {
    long cPtr = ogrJNI.Geometry_GetLinearGeometry__SWIG_2(swigCPtr, this);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry GetCurveGeometry(java.util.Vector options) {
    long cPtr = ogrJNI.Geometry_GetCurveGeometry__SWIG_0(swigCPtr, this, options);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry GetCurveGeometry() {
    long cPtr = ogrJNI.Geometry_GetCurveGeometry__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry Value(double dfDistance) {
    long cPtr = ogrJNI.Geometry_Value(swigCPtr, this, dfDistance);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public Geometry Transform(GeomTransformer transformer) {
    long cPtr = ogrJNI.Geometry_Transform__SWIG_1(swigCPtr, this, GeomTransformer.getCPtr(transformer), transformer);
    return (cPtr == 0) ? null : new Geometry(cPtr, true);
  }

  public PreparedGeometry CreatePreparedGeometry() {
    long cPtr = ogrJNI.Geometry_CreatePreparedGeometry(swigCPtr, this);
    return (cPtr == 0) ? null : new PreparedGeometry(cPtr, true);
  }

  public Geometry(int type, String wkt, byte[] nLen, String gml) {
    this(ogrJNI.new_Geometry__SWIG_0(type, wkt, nLen, gml), true);
  }

  public Geometry(int type) {
    this(ogrJNI.new_Geometry__SWIG_1(type), true);
  }

  public String ExportToWkt() {
    return ogrJNI.Geometry_ExportToWkt__SWIG_1(swigCPtr, this);
  }

}
