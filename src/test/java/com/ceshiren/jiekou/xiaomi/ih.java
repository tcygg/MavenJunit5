/*
package com.mi.info.miim.fs.api.dto.param.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

*/
/**
 * @author Lei Ming
 * @date Created in 2022/2/8 16:13
 * @description 入库订单信息类
 *//*

@Data
@ApiModel(value = "入库订单信息")
public class InboundOrderDTO {

    */
/**
     * 来源单据号
     *//*

    @ApiModelProperty(value = "来源单据号")
    @NotBlank(message = "来源单据号不能为空")
    private String sourceNo;

    */
/**
     * 原始入库单号
     *//*

    @ApiModelProperty(value = "原始入库单号")
    @NotBlank(message = "原始入库单号不能为空")
    private String initialNo;

    */
/**
     * 单据类型
     *//*

    @ApiModelProperty(value = "单据类型")
    @NotBlank(message = "单据类型不能为空")
    private String orderType;

    */
/**
     * 公司主体
     *//*

    @ApiModelProperty(value = "公司主体")
    @NotBlank(message = "公司主体不能为空")
    private String company;

    */
/**
     * 业务线
     *//*

    @ApiModelProperty(value = "业务线")
    @NotBlank(message = "业务线不能为空")
    private String serviceLine;

    */
/**
     * 预计发货时间
     *//*

    @ApiModelProperty(value = "预计发货时间(格式为:yyyy-MM-dd HH:mm:ss)")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime expectSendTime;

    */
/**
     * 预计到货时间
     *//*

    @ApiModelProperty(value = "预计到货时间(格式为:yyyy-MM-dd HH:mm:ss)")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime expectArrivalTime;

    */
/**
     * 来源仓库编码
     *//*

    @ApiModelProperty(value = "来源仓库编码")
    private String sourceWarehouseCode;

    */
/**
     * 收货仓库编码
     *//*

    @ApiModelProperty(value = "收货仓库编码")
    @NotBlank(message = "收货仓库编码不能为空")
    private String inboundWarehouseCode;

    */
/**
     * 货主编码
     *//*

    @ApiModelProperty(value = "货主编码")
    private String ownerCode;

    */
/**
     * 收货方名称
     *//*

    @ApiModelProperty(value = "收货方名称")
    private String receivingName;

    */
/**
     * 收货地址-国家
     *//*

    @ApiModelProperty(value = "收货地址-国家")
    private String receivingCountry;

    */
/**
     * 收货地址-省份
     *//*

    @ApiModelProperty(value = "收货地址-省份")
    private String receivingProvince;

    */
/**
     * 收货地址-市
     *//*

    @ApiModelProperty(value = "收货地址-市")
    private String receivingCity;

    */
/**
     * 收货地址-区
     *//*

    @ApiModelProperty(value = "收货地址-区")
    private String receivingDistrict;

    */
/**
     * 收货详细地址
     *//*

    @ApiModelProperty(value = "收货详细地址")
    private String receivingAddress;

    */
/**
     * 收货人名称
     *//*

    @ApiModelProperty(value = "收货人名称")
    private String receiverName;

    */
/**
     * 收货人电话
     *//*

    @ApiModelProperty(value = "收货人电话")
    private String receiverMobile;

    */
/**
     * 是否强制全量收货（0:不是  1:是）
     *//*

    @ApiModelProperty(value = "是否强制全量收货（0:不是  1:是）")
    @NotBlank(message = "是否强制全量收货不能为空")
    private String isAllReceived;

    */
/**
     * 单据创建人姓名
     *//*

    @ApiModelProperty(value = "单据创建人姓名")
    @NotBlank(message = "单据创建人姓名不能为空")
    private String creatorName;

    */
/**
     * 上游系统创建时间
     *//*

    @ApiModelProperty(value = "上游系统创建时间(格式为:yyyy-MM-dd HH:mm:ss)")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @NotNull(message = "上游系统创建时间不能为空")
    private LocalDateTime sourceCreateTime;

    */
/**
     * 货物明细集合
     *//*

    @ApiModelProperty(value = "货物明细集合")
    @Valid
    @NotEmpty(message = "货物明细集合不能为空")
    private List<com.mi.info.miim.fs.api.dto.param.order.InboundOrderItemDTO> itemList;

    */
/**
     * 生产类型
     *//*

    @ApiModelProperty(value = "生产类型")
    private String produceType;

    */
/**
     * 中转标识 保税新增：2是中转，1是直送
     *//*

    @ApiModelProperty(value = "中转标识(2是中转，1是直送)")
    private String transferFlag;
}*/
