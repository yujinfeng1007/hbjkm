package com.zxw.health.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HealthCodeScanParam implements Serializable {
    private static final long serialVersionUID = -6895483266338882697L;
    private String idcardType;
    private String idcardNo;
    private String cityNo;
    private String agentIdcardType;
    private String agentIdcardNo;
    private String verifierName;
    private String verifierIdcardType;
    private String verifierIdcardNo;
    private String verifierPhone;
    private String verifierCorpId;
    private String verifierCorpName;
    private String verifierDeptName;
    private String optime;
    private String location;
    private String longitude;
    private String latitude;

    public HealthCodeScanParam() {
        this.idcardType = "IDENTITY_CARD";
        this.optime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public HealthCodeScanParam(String idcardNo, String cityNo, String verifierName, String verifierPhone, String location, String longitude, String latitude) {
        this.idcardType = "IDENTITY_CARD";
        this.idcardNo = idcardNo;
        this.cityNo = cityNo;
        this.verifierName = verifierName;
        this.verifierPhone = verifierPhone;
        this.optime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.location = location;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public HealthCodeScanParam(final String idcardType, final String idcardNo, final String cityNo, final String agentIdcardType, final String agentIdcardNo, final String verifierName, final String verifierIdcardType, final String verifierIdcardNo, final String verifierPhone, final String verifierCorpId, final String verifierCorpName, final String verifierDeptName, final String optime, final String location, final String longitude, final String latitude) {
        this.idcardType = idcardType;
        this.idcardNo = idcardNo;
        this.cityNo = cityNo;
        this.agentIdcardType = agentIdcardType;
        this.agentIdcardNo = agentIdcardNo;
        this.verifierName = verifierName;
        this.verifierIdcardType = verifierIdcardType;
        this.verifierIdcardNo = verifierIdcardNo;
        this.verifierPhone = verifierPhone;
        this.verifierCorpId = verifierCorpId;
        this.verifierCorpName = verifierCorpName;
        this.verifierDeptName = verifierDeptName;
        this.optime = optime;
        this.location = location;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getIdcardType() {
        return this.idcardType;
    }

    public String getIdcardNo() {
        return this.idcardNo;
    }

    public String getCityNo() {
        return this.cityNo;
    }

    public String getAgentIdcardType() {
        return this.agentIdcardType;
    }

    public String getAgentIdcardNo() {
        return this.agentIdcardNo;
    }

    public String getVerifierName() {
        return this.verifierName;
    }

    public String getVerifierIdcardType() {
        return this.verifierIdcardType;
    }

    public String getVerifierIdcardNo() {
        return this.verifierIdcardNo;
    }

    public String getVerifierPhone() {
        return this.verifierPhone;
    }

    public String getVerifierCorpId() {
        return this.verifierCorpId;
    }

    public String getVerifierCorpName() {
        return this.verifierCorpName;
    }

    public String getVerifierDeptName() {
        return this.verifierDeptName;
    }

    public String getOptime() {
        return this.optime;
    }

    public String getLocation() {
        return this.location;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public void setIdcardType(final String idcardType) {
        this.idcardType = idcardType;
    }

    public void setIdcardNo(final String idcardNo) {
        this.idcardNo = idcardNo;
    }

    public void setCityNo(final String cityNo) {
        this.cityNo = cityNo;
    }

    public void setAgentIdcardType(final String agentIdcardType) {
        this.agentIdcardType = agentIdcardType;
    }

    public void setAgentIdcardNo(final String agentIdcardNo) {
        this.agentIdcardNo = agentIdcardNo;
    }

    public void setVerifierName(final String verifierName) {
        this.verifierName = verifierName;
    }

    public void setVerifierIdcardType(final String verifierIdcardType) {
        this.verifierIdcardType = verifierIdcardType;
    }

    public void setVerifierIdcardNo(final String verifierIdcardNo) {
        this.verifierIdcardNo = verifierIdcardNo;
    }

    public void setVerifierPhone(final String verifierPhone) {
        this.verifierPhone = verifierPhone;
    }

    public void setVerifierCorpId(final String verifierCorpId) {
        this.verifierCorpId = verifierCorpId;
    }

    public void setVerifierCorpName(final String verifierCorpName) {
        this.verifierCorpName = verifierCorpName;
    }

    public void setVerifierDeptName(final String verifierDeptName) {
        this.verifierDeptName = verifierDeptName;
    }

    public void setOptime(final String optime) {
        this.optime = optime;
    }

    public void setLocation(final String location) {
        this.location = location;
    }

    public void setLongitude(final String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(final String latitude) {
        this.latitude = latitude;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof HealthCodeScanParam)) {
            return false;
        } else {
            HealthCodeScanParam other = (HealthCodeScanParam)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label203: {
                    Object this$idcardType = this.getIdcardType();
                    Object other$idcardType = other.getIdcardType();
                    if (this$idcardType == null) {
                        if (other$idcardType == null) {
                            break label203;
                        }
                    } else if (this$idcardType.equals(other$idcardType)) {
                        break label203;
                    }

                    return false;
                }

                Object this$idcardNo = this.getIdcardNo();
                Object other$idcardNo = other.getIdcardNo();
                if (this$idcardNo == null) {
                    if (other$idcardNo != null) {
                        return false;
                    }
                } else if (!this$idcardNo.equals(other$idcardNo)) {
                    return false;
                }

                Object this$cityNo = this.getCityNo();
                Object other$cityNo = other.getCityNo();
                if (this$cityNo == null) {
                    if (other$cityNo != null) {
                        return false;
                    }
                } else if (!this$cityNo.equals(other$cityNo)) {
                    return false;
                }

                label182: {
                    Object this$agentIdcardType = this.getAgentIdcardType();
                    Object other$agentIdcardType = other.getAgentIdcardType();
                    if (this$agentIdcardType == null) {
                        if (other$agentIdcardType == null) {
                            break label182;
                        }
                    } else if (this$agentIdcardType.equals(other$agentIdcardType)) {
                        break label182;
                    }

                    return false;
                }

                label175: {
                    Object this$agentIdcardNo = this.getAgentIdcardNo();
                    Object other$agentIdcardNo = other.getAgentIdcardNo();
                    if (this$agentIdcardNo == null) {
                        if (other$agentIdcardNo == null) {
                            break label175;
                        }
                    } else if (this$agentIdcardNo.equals(other$agentIdcardNo)) {
                        break label175;
                    }

                    return false;
                }

                label168: {
                    Object this$verifierName = this.getVerifierName();
                    Object other$verifierName = other.getVerifierName();
                    if (this$verifierName == null) {
                        if (other$verifierName == null) {
                            break label168;
                        }
                    } else if (this$verifierName.equals(other$verifierName)) {
                        break label168;
                    }

                    return false;
                }

                Object this$verifierIdcardType = this.getVerifierIdcardType();
                Object other$verifierIdcardType = other.getVerifierIdcardType();
                if (this$verifierIdcardType == null) {
                    if (other$verifierIdcardType != null) {
                        return false;
                    }
                } else if (!this$verifierIdcardType.equals(other$verifierIdcardType)) {
                    return false;
                }

                label154: {
                    Object this$verifierIdcardNo = this.getVerifierIdcardNo();
                    Object other$verifierIdcardNo = other.getVerifierIdcardNo();
                    if (this$verifierIdcardNo == null) {
                        if (other$verifierIdcardNo == null) {
                            break label154;
                        }
                    } else if (this$verifierIdcardNo.equals(other$verifierIdcardNo)) {
                        break label154;
                    }

                    return false;
                }

                Object this$verifierPhone = this.getVerifierPhone();
                Object other$verifierPhone = other.getVerifierPhone();
                if (this$verifierPhone == null) {
                    if (other$verifierPhone != null) {
                        return false;
                    }
                } else if (!this$verifierPhone.equals(other$verifierPhone)) {
                    return false;
                }

                label140: {
                    Object this$verifierCorpId = this.getVerifierCorpId();
                    Object other$verifierCorpId = other.getVerifierCorpId();
                    if (this$verifierCorpId == null) {
                        if (other$verifierCorpId == null) {
                            break label140;
                        }
                    } else if (this$verifierCorpId.equals(other$verifierCorpId)) {
                        break label140;
                    }

                    return false;
                }

                Object this$verifierCorpName = this.getVerifierCorpName();
                Object other$verifierCorpName = other.getVerifierCorpName();
                if (this$verifierCorpName == null) {
                    if (other$verifierCorpName != null) {
                        return false;
                    }
                } else if (!this$verifierCorpName.equals(other$verifierCorpName)) {
                    return false;
                }

                Object this$verifierDeptName = this.getVerifierDeptName();
                Object other$verifierDeptName = other.getVerifierDeptName();
                if (this$verifierDeptName == null) {
                    if (other$verifierDeptName != null) {
                        return false;
                    }
                } else if (!this$verifierDeptName.equals(other$verifierDeptName)) {
                    return false;
                }

                label119: {
                    Object this$optime = this.getOptime();
                    Object other$optime = other.getOptime();
                    if (this$optime == null) {
                        if (other$optime == null) {
                            break label119;
                        }
                    } else if (this$optime.equals(other$optime)) {
                        break label119;
                    }

                    return false;
                }

                label112: {
                    Object this$location = this.getLocation();
                    Object other$location = other.getLocation();
                    if (this$location == null) {
                        if (other$location == null) {
                            break label112;
                        }
                    } else if (this$location.equals(other$location)) {
                        break label112;
                    }

                    return false;
                }

                Object this$longitude = this.getLongitude();
                Object other$longitude = other.getLongitude();
                if (this$longitude == null) {
                    if (other$longitude != null) {
                        return false;
                    }
                } else if (!this$longitude.equals(other$longitude)) {
                    return false;
                }

                Object this$latitude = this.getLatitude();
                Object other$latitude = other.getLatitude();
                if (this$latitude == null) {
                    if (other$latitude != null) {
                        return false;
                    }
                } else if (!this$latitude.equals(other$latitude)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof HealthCodeScanParam;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $idcardType = this.getIdcardType();
        result = result * 59 + ($idcardType == null ? 43 : $idcardType.hashCode());
        Object $idcardNo = this.getIdcardNo();
        result = result * 59 + ($idcardNo == null ? 43 : $idcardNo.hashCode());
        Object $cityNo = this.getCityNo();
        result = result * 59 + ($cityNo == null ? 43 : $cityNo.hashCode());
        Object $agentIdcardType = this.getAgentIdcardType();
        result = result * 59 + ($agentIdcardType == null ? 43 : $agentIdcardType.hashCode());
        Object $agentIdcardNo = this.getAgentIdcardNo();
        result = result * 59 + ($agentIdcardNo == null ? 43 : $agentIdcardNo.hashCode());
        Object $verifierName = this.getVerifierName();
        result = result * 59 + ($verifierName == null ? 43 : $verifierName.hashCode());
        Object $verifierIdcardType = this.getVerifierIdcardType();
        result = result * 59 + ($verifierIdcardType == null ? 43 : $verifierIdcardType.hashCode());
        Object $verifierIdcardNo = this.getVerifierIdcardNo();
        result = result * 59 + ($verifierIdcardNo == null ? 43 : $verifierIdcardNo.hashCode());
        Object $verifierPhone = this.getVerifierPhone();
        result = result * 59 + ($verifierPhone == null ? 43 : $verifierPhone.hashCode());
        Object $verifierCorpId = this.getVerifierCorpId();
        result = result * 59 + ($verifierCorpId == null ? 43 : $verifierCorpId.hashCode());
        Object $verifierCorpName = this.getVerifierCorpName();
        result = result * 59 + ($verifierCorpName == null ? 43 : $verifierCorpName.hashCode());
        Object $verifierDeptName = this.getVerifierDeptName();
        result = result * 59 + ($verifierDeptName == null ? 43 : $verifierDeptName.hashCode());
        Object $optime = this.getOptime();
        result = result * 59 + ($optime == null ? 43 : $optime.hashCode());
        Object $location = this.getLocation();
        result = result * 59 + ($location == null ? 43 : $location.hashCode());
        Object $longitude = this.getLongitude();
        result = result * 59 + ($longitude == null ? 43 : $longitude.hashCode());
        Object $latitude = this.getLatitude();
        result = result * 59 + ($latitude == null ? 43 : $latitude.hashCode());
        return result;
    }

    public String toString() {
        return "HealthCodeScanParam(idcardType=" + this.getIdcardType() + ", idcardNo=" + this.getIdcardNo() + ", cityNo=" + this.getCityNo() + ", agentIdcardType=" + this.getAgentIdcardType() + ", agentIdcardNo=" + this.getAgentIdcardNo() + ", verifierName=" + this.getVerifierName() + ", verifierIdcardType=" + this.getVerifierIdcardType() + ", verifierIdcardNo=" + this.getVerifierIdcardNo() + ", verifierPhone=" + this.getVerifierPhone() + ", verifierCorpId=" + this.getVerifierCorpId() + ", verifierCorpName=" + this.getVerifierCorpName() + ", verifierDeptName=" + this.getVerifierDeptName() + ", optime=" + this.getOptime() + ", location=" + this.getLocation() + ", longitude=" + this.getLongitude() + ", latitude=" + this.getLatitude() + ")";
    }
}
