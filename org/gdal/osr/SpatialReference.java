package org.gdal.osr;

public class SpatialReference implements Cloneable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public SpatialReference(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SpatialReference obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        osrJNI.delete_SpatialReference(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof SpatialReference)
      equal = (((SpatialReference)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public Object clone()
  {
      return Clone();
  }

  public int hashCode() {
     return (int)swigCPtr;
  }

  public String toString() {
    return __str__();
  }

  public String ExportToWkt() {
    String array[] = new String[] {null};
    ExportToWkt(array);
    return array[0];
  }

  public String ExportToPrettyWkt(int simplify) {
    String array[] = new String[] {null};
    ExportToPrettyWkt(array, simplify);
    return array[0];
  }

  public String ExportToPrettyWkt() {
    String array[] = new String[] {null};
    ExportToPrettyWkt(array);
    return array[0];
  }

  public String ExportToProj4() {
    String array[] = new String[] {null};
    ExportToProj4(array);
    return array[0];
  }

  public String ExportToXML( String dialect) {
    String array[] = new String[] {null};
    ExportToXML(array, dialect);
    return array[0];
  }

  public String ExportToXML() {
    String array[] = new String[] {null};
    ExportToXML(array);
    return array[0];
  }

  public String ExportToMICoordSys() {
    String array[] = new String[] {null};
    ExportToMICoordSys(array);
    return array[0];
  }

  public double[] GetTOWGS84()
  {
      double array[] = new double[7];
      GetTOWGS84(array);
      return array;
  }

  public int SetTOWGS84( double p1, double p2, double p3)
  {
      return SetTOWGS84(p1, p2, p3, 0, 0, 0, 0);
  }

  public SpatialReference(String wkt) {
    this(osrJNI.new_SpatialReference__SWIG_0(wkt), true);
  }

  public SpatialReference() {
    this(osrJNI.new_SpatialReference__SWIG_1(), true);
  }

  public String __str__() {
    return osrJNI.SpatialReference___str__(swigCPtr, this);
  }

  public String GetName() {
    return osrJNI.SpatialReference_GetName(swigCPtr, this);
  }

  public int IsSame(SpatialReference rhs, java.util.Vector options) {
    return osrJNI.SpatialReference_IsSame__SWIG_0(swigCPtr, this, SpatialReference.getCPtr(rhs), rhs, options);
  }

  public int IsSame(SpatialReference rhs) {
    return osrJNI.SpatialReference_IsSame__SWIG_1(swigCPtr, this, SpatialReference.getCPtr(rhs), rhs);
  }

  public int IsSameGeogCS(SpatialReference rhs) {
    return osrJNI.SpatialReference_IsSameGeogCS(swigCPtr, this, SpatialReference.getCPtr(rhs), rhs);
  }

  public int IsSameVertCS(SpatialReference rhs) {
    return osrJNI.SpatialReference_IsSameVertCS(swigCPtr, this, SpatialReference.getCPtr(rhs), rhs);
  }

  public int IsGeographic() {
    return osrJNI.SpatialReference_IsGeographic(swigCPtr, this);
  }

  public int IsProjected() {
    return osrJNI.SpatialReference_IsProjected(swigCPtr, this);
  }

  public int IsCompound() {
    return osrJNI.SpatialReference_IsCompound(swigCPtr, this);
  }

  public int IsGeocentric() {
    return osrJNI.SpatialReference_IsGeocentric(swigCPtr, this);
  }

  public int IsLocal() {
    return osrJNI.SpatialReference_IsLocal(swigCPtr, this);
  }

  public int IsVertical() {
    return osrJNI.SpatialReference_IsVertical(swigCPtr, this);
  }

  public int EPSGTreatsAsLatLong() {
    return osrJNI.SpatialReference_EPSGTreatsAsLatLong(swigCPtr, this);
  }

  public int EPSGTreatsAsNorthingEasting() {
    return osrJNI.SpatialReference_EPSGTreatsAsNorthingEasting(swigCPtr, this);
  }

  public int SetAuthority(String pszTargetKey, String pszAuthority, int nCode) {
    return osrJNI.SpatialReference_SetAuthority(swigCPtr, this, pszTargetKey, pszAuthority, nCode);
  }

  public String GetAttrValue(String name, int child) {
    return osrJNI.SpatialReference_GetAttrValue__SWIG_0(swigCPtr, this, name, child);
  }

  public String GetAttrValue(String name) {
    return osrJNI.SpatialReference_GetAttrValue__SWIG_1(swigCPtr, this, name);
  }

  public int SetAttrValue(String name, String value) {
    return osrJNI.SpatialReference_SetAttrValue(swigCPtr, this, name, value);
  }

  public int SetAngularUnits(String name, double to_radians) {
    return osrJNI.SpatialReference_SetAngularUnits(swigCPtr, this, name, to_radians);
  }

  public double GetAngularUnits() {
    return osrJNI.SpatialReference_GetAngularUnits(swigCPtr, this);
  }

  public String GetAngularUnitsName() {
    return osrJNI.SpatialReference_GetAngularUnitsName(swigCPtr, this);
  }

  public int SetTargetLinearUnits(String target, String name, double to_meters) {
    return osrJNI.SpatialReference_SetTargetLinearUnits(swigCPtr, this, target, name, to_meters);
  }

  public int SetLinearUnits(String name, double to_meters) {
    return osrJNI.SpatialReference_SetLinearUnits(swigCPtr, this, name, to_meters);
  }

  public int SetLinearUnitsAndUpdateParameters(String name, double to_meters) {
    return osrJNI.SpatialReference_SetLinearUnitsAndUpdateParameters(swigCPtr, this, name, to_meters);
  }

  public double GetTargetLinearUnits(String target_key) {
    return osrJNI.SpatialReference_GetTargetLinearUnits(swigCPtr, this, target_key);
  }

  public double GetLinearUnits() {
    return osrJNI.SpatialReference_GetLinearUnits(swigCPtr, this);
  }

  public String GetLinearUnitsName() {
    return osrJNI.SpatialReference_GetLinearUnitsName(swigCPtr, this);
  }

  public String GetAuthorityCode(String target_key) {
    return osrJNI.SpatialReference_GetAuthorityCode(swigCPtr, this, target_key);
  }

  public String GetAuthorityName(String target_key) {
    return osrJNI.SpatialReference_GetAuthorityName(swigCPtr, this, target_key);
  }

  public AreaOfUse GetAreaOfUse() {
    long cPtr = osrJNI.SpatialReference_GetAreaOfUse(swigCPtr, this);
    return (cPtr == 0) ? null : new AreaOfUse(cPtr, true);
  }

  public String GetAxisName(String target_key, int iAxis) {
    return osrJNI.SpatialReference_GetAxisName(swigCPtr, this, target_key, iAxis);
  }

  public int GetAxisOrientation(String target_key, int iAxis) {
    return osrJNI.SpatialReference_GetAxisOrientation(swigCPtr, this, target_key, iAxis);
  }

  public int GetAxisMappingStrategy() {
    return osrJNI.SpatialReference_GetAxisMappingStrategy(swigCPtr, this);
  }

  public void SetAxisMappingStrategy(int strategy) {
    osrJNI.SpatialReference_SetAxisMappingStrategy(swigCPtr, this, strategy);
  }

  public int[] GetDataAxisToSRSAxisMapping(SWIGTYPE_p_int nLen, SWIGTYPE_p_p_int pList) {
    return osrJNI.SpatialReference_GetDataAxisToSRSAxisMapping(swigCPtr, this, SWIGTYPE_p_int.getCPtr(nLen), SWIGTYPE_p_p_int.getCPtr(pList));
  }

  public int SetUTM(int zone, int north) {
    return osrJNI.SpatialReference_SetUTM__SWIG_0(swigCPtr, this, zone, north);
  }

  public int SetUTM(int zone) {
    return osrJNI.SpatialReference_SetUTM__SWIG_1(swigCPtr, this, zone);
  }

  public int GetUTMZone() {
    return osrJNI.SpatialReference_GetUTMZone(swigCPtr, this);
  }

  public int SetStatePlane(int zone, int is_nad83, String unitsname, double units) {
    return osrJNI.SpatialReference_SetStatePlane__SWIG_0(swigCPtr, this, zone, is_nad83, unitsname, units);
  }

  public int SetStatePlane(int zone, int is_nad83, String unitsname) {
    return osrJNI.SpatialReference_SetStatePlane__SWIG_1(swigCPtr, this, zone, is_nad83, unitsname);
  }

  public int SetStatePlane(int zone, int is_nad83) {
    return osrJNI.SpatialReference_SetStatePlane__SWIG_2(swigCPtr, this, zone, is_nad83);
  }

  public int SetStatePlane(int zone) {
    return osrJNI.SpatialReference_SetStatePlane__SWIG_3(swigCPtr, this, zone);
  }

  public int AutoIdentifyEPSG() {
    return osrJNI.SpatialReference_AutoIdentifyEPSG(swigCPtr, this);
  }

  public int SetProjection(String arg) {
    return osrJNI.SpatialReference_SetProjection(swigCPtr, this, arg);
  }

  public int SetProjParm(String name, double val) {
    return osrJNI.SpatialReference_SetProjParm(swigCPtr, this, name, val);
  }

  public double GetProjParm(String name, double default_val) {
    return osrJNI.SpatialReference_GetProjParm__SWIG_0(swigCPtr, this, name, default_val);
  }

  public double GetProjParm(String name) {
    return osrJNI.SpatialReference_GetProjParm__SWIG_1(swigCPtr, this, name);
  }

  public int SetNormProjParm(String name, double val) {
    return osrJNI.SpatialReference_SetNormProjParm(swigCPtr, this, name, val);
  }

  public double GetNormProjParm(String name, double default_val) {
    return osrJNI.SpatialReference_GetNormProjParm__SWIG_0(swigCPtr, this, name, default_val);
  }

  public double GetNormProjParm(String name) {
    return osrJNI.SpatialReference_GetNormProjParm__SWIG_1(swigCPtr, this, name);
  }

  public double GetSemiMajor() {
    return osrJNI.SpatialReference_GetSemiMajor(swigCPtr, this);
  }

  public double GetSemiMinor() {
    return osrJNI.SpatialReference_GetSemiMinor(swigCPtr, this);
  }

  public double GetInvFlattening() {
    return osrJNI.SpatialReference_GetInvFlattening(swigCPtr, this);
  }

  public int SetACEA(double stdp1, double stdp2, double clat, double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetACEA(swigCPtr, this, stdp1, stdp2, clat, clong, fe, fn);
  }

  public int SetAE(double clat, double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetAE(swigCPtr, this, clat, clong, fe, fn);
  }

  public int SetBonne(double stdp, double cm, double fe, double fn) {
    return osrJNI.SpatialReference_SetBonne(swigCPtr, this, stdp, cm, fe, fn);
  }

  public int SetCEA(double stdp1, double cm, double fe, double fn) {
    return osrJNI.SpatialReference_SetCEA(swigCPtr, this, stdp1, cm, fe, fn);
  }

  public int SetCS(double clat, double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetCS(swigCPtr, this, clat, clong, fe, fn);
  }

  public int SetEC(double stdp1, double stdp2, double clat, double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetEC(swigCPtr, this, stdp1, stdp2, clat, clong, fe, fn);
  }

  public int SetEckertIV(double cm, double fe, double fn) {
    return osrJNI.SpatialReference_SetEckertIV(swigCPtr, this, cm, fe, fn);
  }

  public int SetEckertVI(double cm, double fe, double fn) {
    return osrJNI.SpatialReference_SetEckertVI(swigCPtr, this, cm, fe, fn);
  }

  public int SetEquirectangular(double clat, double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetEquirectangular(swigCPtr, this, clat, clong, fe, fn);
  }

  public int SetEquirectangular2(double clat, double clong, double pseudostdparallellat, double fe, double fn) {
    return osrJNI.SpatialReference_SetEquirectangular2(swigCPtr, this, clat, clong, pseudostdparallellat, fe, fn);
  }

  public int SetGaussSchreiberTMercator(double clat, double clong, double sc, double fe, double fn) {
    return osrJNI.SpatialReference_SetGaussSchreiberTMercator(swigCPtr, this, clat, clong, sc, fe, fn);
  }

  public int SetGS(double cm, double fe, double fn) {
    return osrJNI.SpatialReference_SetGS(swigCPtr, this, cm, fe, fn);
  }

  public int SetGH(double cm, double fe, double fn) {
    return osrJNI.SpatialReference_SetGH(swigCPtr, this, cm, fe, fn);
  }

  public int SetIGH() {
    return osrJNI.SpatialReference_SetIGH(swigCPtr, this);
  }

  public int SetGEOS(double cm, double satelliteheight, double fe, double fn) {
    return osrJNI.SpatialReference_SetGEOS(swigCPtr, this, cm, satelliteheight, fe, fn);
  }

  public int SetGnomonic(double clat, double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetGnomonic(swigCPtr, this, clat, clong, fe, fn);
  }

  public int SetHOM(double clat, double clong, double azimuth, double recttoskew, double scale, double fe, double fn) {
    return osrJNI.SpatialReference_SetHOM(swigCPtr, this, clat, clong, azimuth, recttoskew, scale, fe, fn);
  }

  public int SetHOM2PNO(double clat, double dfLat1, double dfLong1, double dfLat2, double dfLong2, double scale, double fe, double fn) {
    return osrJNI.SpatialReference_SetHOM2PNO(swigCPtr, this, clat, dfLat1, dfLong1, dfLat2, dfLong2, scale, fe, fn);
  }

  public int SetKrovak(double clat, double clong, double azimuth, double pseudostdparallellat, double scale, double fe, double fn) {
    return osrJNI.SpatialReference_SetKrovak(swigCPtr, this, clat, clong, azimuth, pseudostdparallellat, scale, fe, fn);
  }

  public int SetLAEA(double clat, double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetLAEA(swigCPtr, this, clat, clong, fe, fn);
  }

  public int SetLCC(double stdp1, double stdp2, double clat, double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetLCC(swigCPtr, this, stdp1, stdp2, clat, clong, fe, fn);
  }

  public int SetLCC1SP(double clat, double clong, double scale, double fe, double fn) {
    return osrJNI.SpatialReference_SetLCC1SP(swigCPtr, this, clat, clong, scale, fe, fn);
  }

  public int SetLCCB(double stdp1, double stdp2, double clat, double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetLCCB(swigCPtr, this, stdp1, stdp2, clat, clong, fe, fn);
  }

  public int SetMC(double clat, double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetMC(swigCPtr, this, clat, clong, fe, fn);
  }

  public int SetMercator(double clat, double clong, double scale, double fe, double fn) {
    return osrJNI.SpatialReference_SetMercator(swigCPtr, this, clat, clong, scale, fe, fn);
  }

  public int SetMercator2SP(double stdp1, double clat, double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetMercator2SP(swigCPtr, this, stdp1, clat, clong, fe, fn);
  }

  public int SetMollweide(double cm, double fe, double fn) {
    return osrJNI.SpatialReference_SetMollweide(swigCPtr, this, cm, fe, fn);
  }

  public int SetNZMG(double clat, double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetNZMG(swigCPtr, this, clat, clong, fe, fn);
  }

  public int SetOS(double dfOriginLat, double dfCMeridian, double scale, double fe, double fn) {
    return osrJNI.SpatialReference_SetOS(swigCPtr, this, dfOriginLat, dfCMeridian, scale, fe, fn);
  }

  public int SetOrthographic(double clat, double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetOrthographic(swigCPtr, this, clat, clong, fe, fn);
  }

  public int SetPolyconic(double clat, double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetPolyconic(swigCPtr, this, clat, clong, fe, fn);
  }

  public int SetPS(double clat, double clong, double scale, double fe, double fn) {
    return osrJNI.SpatialReference_SetPS(swigCPtr, this, clat, clong, scale, fe, fn);
  }

  public int SetRobinson(double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetRobinson(swigCPtr, this, clong, fe, fn);
  }

  public int SetSinusoidal(double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetSinusoidal(swigCPtr, this, clong, fe, fn);
  }

  public int SetStereographic(double clat, double clong, double scale, double fe, double fn) {
    return osrJNI.SpatialReference_SetStereographic(swigCPtr, this, clat, clong, scale, fe, fn);
  }

  public int SetSOC(double latitudeoforigin, double cm, double fe, double fn) {
    return osrJNI.SpatialReference_SetSOC(swigCPtr, this, latitudeoforigin, cm, fe, fn);
  }

  public int SetTM(double clat, double clong, double scale, double fe, double fn) {
    return osrJNI.SpatialReference_SetTM(swigCPtr, this, clat, clong, scale, fe, fn);
  }

  public int SetTMVariant(String pszVariantName, double clat, double clong, double scale, double fe, double fn) {
    return osrJNI.SpatialReference_SetTMVariant(swigCPtr, this, pszVariantName, clat, clong, scale, fe, fn);
  }

  public int SetTMG(double clat, double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetTMG(swigCPtr, this, clat, clong, fe, fn);
  }

  public int SetTMSO(double clat, double clong, double scale, double fe, double fn) {
    return osrJNI.SpatialReference_SetTMSO(swigCPtr, this, clat, clong, scale, fe, fn);
  }

  public int SetVDG(double clong, double fe, double fn) {
    return osrJNI.SpatialReference_SetVDG(swigCPtr, this, clong, fe, fn);
  }

  public int SetWellKnownGeogCS(String name) {
    return osrJNI.SpatialReference_SetWellKnownGeogCS(swigCPtr, this, name);
  }

  public int SetFromUserInput(String name) {
    return osrJNI.SpatialReference_SetFromUserInput(swigCPtr, this, name);
  }

  public int CopyGeogCSFrom(SpatialReference rhs) {
    return osrJNI.SpatialReference_CopyGeogCSFrom(swigCPtr, this, SpatialReference.getCPtr(rhs), rhs);
  }

  public int SetTOWGS84(double p1, double p2, double p3, double p4, double p5, double p6, double p7) {
    return osrJNI.SpatialReference_SetTOWGS84(swigCPtr, this, p1, p2, p3, p4, p5, p6, p7);
  }

  public int GetTOWGS84(double[] argout) {
    return osrJNI.SpatialReference_GetTOWGS84(swigCPtr, this, argout);
  }

  public int SetLocalCS(String pszName) {
    return osrJNI.SpatialReference_SetLocalCS(swigCPtr, this, pszName);
  }

  public int SetGeogCS(String pszGeogName, String pszDatumName, String pszEllipsoidName, double dfSemiMajor, double dfInvFlattening, String pszPMName, double dfPMOffset, String pszUnits, double dfConvertToRadians) {
    return osrJNI.SpatialReference_SetGeogCS__SWIG_0(swigCPtr, this, pszGeogName, pszDatumName, pszEllipsoidName, dfSemiMajor, dfInvFlattening, pszPMName, dfPMOffset, pszUnits, dfConvertToRadians);
  }

  public int SetGeogCS(String pszGeogName, String pszDatumName, String pszEllipsoidName, double dfSemiMajor, double dfInvFlattening, String pszPMName, double dfPMOffset, String pszUnits) {
    return osrJNI.SpatialReference_SetGeogCS__SWIG_1(swigCPtr, this, pszGeogName, pszDatumName, pszEllipsoidName, dfSemiMajor, dfInvFlattening, pszPMName, dfPMOffset, pszUnits);
  }

  public int SetGeogCS(String pszGeogName, String pszDatumName, String pszEllipsoidName, double dfSemiMajor, double dfInvFlattening, String pszPMName, double dfPMOffset) {
    return osrJNI.SpatialReference_SetGeogCS__SWIG_2(swigCPtr, this, pszGeogName, pszDatumName, pszEllipsoidName, dfSemiMajor, dfInvFlattening, pszPMName, dfPMOffset);
  }

  public int SetGeogCS(String pszGeogName, String pszDatumName, String pszEllipsoidName, double dfSemiMajor, double dfInvFlattening, String pszPMName) {
    return osrJNI.SpatialReference_SetGeogCS__SWIG_3(swigCPtr, this, pszGeogName, pszDatumName, pszEllipsoidName, dfSemiMajor, dfInvFlattening, pszPMName);
  }

  public int SetGeogCS(String pszGeogName, String pszDatumName, String pszEllipsoidName, double dfSemiMajor, double dfInvFlattening) {
    return osrJNI.SpatialReference_SetGeogCS__SWIG_4(swigCPtr, this, pszGeogName, pszDatumName, pszEllipsoidName, dfSemiMajor, dfInvFlattening);
  }

  public int SetProjCS(String name) {
    return osrJNI.SpatialReference_SetProjCS__SWIG_0(swigCPtr, this, name);
  }

  public int SetProjCS() {
    return osrJNI.SpatialReference_SetProjCS__SWIG_1(swigCPtr, this);
  }

  public int SetGeocCS(String name) {
    return osrJNI.SpatialReference_SetGeocCS__SWIG_0(swigCPtr, this, name);
  }

  public int SetGeocCS() {
    return osrJNI.SpatialReference_SetGeocCS__SWIG_1(swigCPtr, this);
  }

  public int SetVertCS(String VertCSName, String VertDatumName, int VertDatumType) {
    return osrJNI.SpatialReference_SetVertCS__SWIG_0(swigCPtr, this, VertCSName, VertDatumName, VertDatumType);
  }

  public int SetVertCS(String VertCSName, String VertDatumName) {
    return osrJNI.SpatialReference_SetVertCS__SWIG_1(swigCPtr, this, VertCSName, VertDatumName);
  }

  public int SetVertCS(String VertCSName) {
    return osrJNI.SpatialReference_SetVertCS__SWIG_2(swigCPtr, this, VertCSName);
  }

  public int SetVertCS() {
    return osrJNI.SpatialReference_SetVertCS__SWIG_3(swigCPtr, this);
  }

  public int SetCompoundCS(String name, SpatialReference horizcs, SpatialReference vertcs) {
    return osrJNI.SpatialReference_SetCompoundCS(swigCPtr, this, name, SpatialReference.getCPtr(horizcs), horizcs, SpatialReference.getCPtr(vertcs), vertcs);
  }

  public int ImportFromWkt(String ppszInput) {
    return osrJNI.SpatialReference_ImportFromWkt(swigCPtr, this, ppszInput);
  }

  public int ImportFromProj4(String ppszInput) {
    return osrJNI.SpatialReference_ImportFromProj4(swigCPtr, this, ppszInput);
  }

  public int ImportFromUrl(String url) {
    return osrJNI.SpatialReference_ImportFromUrl(swigCPtr, this, url);
  }

  public int ImportFromESRI(java.util.Vector ppszInput) {
    return osrJNI.SpatialReference_ImportFromESRI(swigCPtr, this, ppszInput);
  }

  public int ImportFromEPSG(int arg) {
    return osrJNI.SpatialReference_ImportFromEPSG(swigCPtr, this, arg);
  }

  public int ImportFromEPSGA(int arg) {
    return osrJNI.SpatialReference_ImportFromEPSGA(swigCPtr, this, arg);
  }

  public int ImportFromPCI(String proj, String units, double[] argin) {
    return osrJNI.SpatialReference_ImportFromPCI__SWIG_0(swigCPtr, this, proj, units, argin);
  }

  public int ImportFromPCI(String proj, String units) {
    return osrJNI.SpatialReference_ImportFromPCI__SWIG_1(swigCPtr, this, proj, units);
  }

  public int ImportFromPCI(String proj) {
    return osrJNI.SpatialReference_ImportFromPCI__SWIG_2(swigCPtr, this, proj);
  }

  public int ImportFromUSGS(int proj_code, int zone, double[] argin, int datum_code) {
    return osrJNI.SpatialReference_ImportFromUSGS__SWIG_0(swigCPtr, this, proj_code, zone, argin, datum_code);
  }

  public int ImportFromUSGS(int proj_code, int zone, double[] argin) {
    return osrJNI.SpatialReference_ImportFromUSGS__SWIG_1(swigCPtr, this, proj_code, zone, argin);
  }

  public int ImportFromUSGS(int proj_code, int zone) {
    return osrJNI.SpatialReference_ImportFromUSGS__SWIG_2(swigCPtr, this, proj_code, zone);
  }

  public int ImportFromUSGS(int proj_code) {
    return osrJNI.SpatialReference_ImportFromUSGS__SWIG_3(swigCPtr, this, proj_code);
  }

  public int ImportFromXML(String xmlString) {
    return osrJNI.SpatialReference_ImportFromXML(swigCPtr, this, xmlString);
  }

  public int ImportFromERM(String proj, String datum, String units) {
    return osrJNI.SpatialReference_ImportFromERM(swigCPtr, this, proj, datum, units);
  }

  public int ImportFromMICoordSys(String pszCoordSys) {
    return osrJNI.SpatialReference_ImportFromMICoordSys(swigCPtr, this, pszCoordSys);
  }

  public int ImportFromOzi(java.util.Vector papszLines) {
    return osrJNI.SpatialReference_ImportFromOzi(swigCPtr, this, papszLines);
  }

  public int ExportToWkt(String[] argout, java.util.Vector options) {
    return osrJNI.SpatialReference_ExportToWkt__SWIG_0(swigCPtr, this, argout, options);
  }

  public int ExportToWkt(String[] argout) {
    return osrJNI.SpatialReference_ExportToWkt__SWIG_1(swigCPtr, this, argout);
  }

  public int ExportToPrettyWkt(String[] argout, int simplify) {
    return osrJNI.SpatialReference_ExportToPrettyWkt__SWIG_0(swigCPtr, this, argout, simplify);
  }

  public int ExportToPrettyWkt(String[] argout) {
    return osrJNI.SpatialReference_ExportToPrettyWkt__SWIG_1(swigCPtr, this, argout);
  }

  public int ExportToProj4(String[] argout) {
    return osrJNI.SpatialReference_ExportToProj4(swigCPtr, this, argout);
  }

  public int ExportToPCI(String[] proj, String[] units, double[] parms) {
    return osrJNI.SpatialReference_ExportToPCI(swigCPtr, this, proj, units, parms);
  }

  public int ExportToUSGS(int[] code, int[] zone, double[] parms, int[] datum) {
    return osrJNI.SpatialReference_ExportToUSGS(swigCPtr, this, code, zone, parms, datum);
  }

  public int ExportToXML(String[] argout, String dialect) {
    return osrJNI.SpatialReference_ExportToXML__SWIG_0(swigCPtr, this, argout, dialect);
  }

  public int ExportToXML(String[] argout) {
    return osrJNI.SpatialReference_ExportToXML__SWIG_1(swigCPtr, this, argout);
  }

  public int ExportToMICoordSys(String[] argout) {
    return osrJNI.SpatialReference_ExportToMICoordSys(swigCPtr, this, argout);
  }

  public SpatialReference CloneGeogCS() {
    long cPtr = osrJNI.SpatialReference_CloneGeogCS(swigCPtr, this);
    return (cPtr == 0) ? null : new SpatialReference(cPtr, true);
  }

  public SpatialReference Clone() {
    long cPtr = osrJNI.SpatialReference_Clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SpatialReference(cPtr, true);
  }

  public int Validate() {
    return osrJNI.SpatialReference_Validate(swigCPtr, this);
  }

  public int MorphToESRI() {
    return osrJNI.SpatialReference_MorphToESRI(swigCPtr, this);
  }

  public int MorphFromESRI() {
    return osrJNI.SpatialReference_MorphFromESRI(swigCPtr, this);
  }

  public SpatialReference ConvertToOtherProjection(String other_projection, java.util.Vector options) {
    long cPtr = osrJNI.SpatialReference_ConvertToOtherProjection__SWIG_0(swigCPtr, this, other_projection, options);
    return (cPtr == 0) ? null : new SpatialReference(cPtr, true);
  }

  public SpatialReference ConvertToOtherProjection(String other_projection) {
    long cPtr = osrJNI.SpatialReference_ConvertToOtherProjection__SWIG_1(swigCPtr, this, other_projection);
    return (cPtr == 0) ? null : new SpatialReference(cPtr, true);
  }

}