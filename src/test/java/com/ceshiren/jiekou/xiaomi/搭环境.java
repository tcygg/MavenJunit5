///**
//package com.mi.info.miim.fs.api.dto.param.order;
//
//import com.mi.info.miim.fs.bo.BatchBaseBO;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Data;
//
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//
///**
// * @author Lei Ming
// * @date Created in 2022/2/9 10:10
// * @description
// */
//@Data
//@ApiModel(value = "入库订单明细信息")
//public class InboundOrderItemDTO extends BatchBaseBO {
//
//    /**
//     * 入库单行号
//     */
//    @ApiModelProperty(value = "入库单行号")
//    @NotBlank(message = "入库单行号不能为空")
//    private String sourceLineNo;
//
//    /**
//     * 关联出库单  纸质退料单中的原单号 ：9312591606
//     */
//    @ApiModelProperty(value = "关联出库单")
//    private String relationNo;
//
//    /**
//     * 关联出库单行项目
//     */
//    @ApiModelProperty(value = "关联出库单行项目")
//    private String relationLineProject;
//
//    /**
//     * 物料编码
//     */
//    @ApiModelProperty(value = "物料编码")
//    @NotBlank(message = "物料编码不能为空")
//    private String materialCode;
//
//    /**
//     * 入库单预期数量
//     */
//    @ApiModelProperty(value = "入库单预期数量")
//    @Min(value = 1 ,message = "入库单预期数量不能小于1")
//    @NotNull(message = "入库单预期数量不能为空")
//    private Integer expectQuantity;
//
//    /**
//     * 物料单位
//     */
//    @ApiModelProperty(value = "物料单位")
//    @NotBlank(message = "物料单位不能为空")
//    private String unit;
//
//    /**
//     * PO编号
//     */
//    @ApiModelProperty(value = "PO编号")
//    private String poNo;
//
//    /**
//     * PO行号
//     */
//    @ApiModelProperty(value = "PO行号")
//    private String poLineNo;
//
//    /**
//     * 项目
//     */
//    @ApiModelProperty(value = "项目")
//    private String project;
//
//    /**
//     * 货主编码
//     */
//    @ApiModelProperty(value = "货主编码")
//    @NotBlank(message = "货主编码不能为空")
//    private String ownerCode;
//
//    /**
//     * 原产国
//     */
//    @ApiModelProperty(value = "原产国")
//    private String place;
//
//    /**
//     * 生产类型
//     */
//    @ApiModelProperty(value = "生产类型")
//    private String produceType;
//
//    /**
//     * oms下发ASN号
//     */
//    @ApiModelProperty(value = "oms下发ASN号")
//    private String omsAsnNo;
//
//    /**
//     * oms下发ASN行号
//     */
//    @ApiModelProperty(value = "oms下发ASN行号")
//    private String omsAsnLineNo;
//
//
//}
//
