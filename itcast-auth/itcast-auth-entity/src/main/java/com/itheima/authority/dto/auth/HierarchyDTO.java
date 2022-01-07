package com.itheima.authority.dto.auth;

import com.itheima.authority.enumeration.auth.Sex;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 实体类
 * 用户层次结构
 * </p>
 */
@Data
@ApiModel(value = "HierarchyDTO", description = "用户层次结构")
public class HierarchyDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean expand = true;

    @ApiModelProperty(value = "自身节点")
    private boolean self;

    @ApiModelProperty(value = "上级领导")
    private Long superior;

    @ApiModelProperty(value = "账号")
    private String account;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "组织ID")
    private Long orgId;

    @ApiModelProperty(value = "组织名称")
    private String orgName;

    @ApiModelProperty(value = "岗位ID")
    private Long stationId;

    @ApiModelProperty(value = "岗位名称")
    private String stationName;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "手机")
    private String mobile;

    @ApiModelProperty(value = "性别 Sex{W:女;M:男;N:未知}")
    private Sex sex;

    @ApiModelProperty(value = "启用状态 1启用 0禁用")
    private Boolean status;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "工作描述")
    private String workDescribe;

    private List<HierarchyDTO> children;
}
