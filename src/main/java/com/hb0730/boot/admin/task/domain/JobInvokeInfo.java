package com.hb0730.boot.admin.task.domain;

import lombok.*;

/**
 * job invoke info
 *
 * @author bing_huang
 * @see com.hb0730.boot.admin.task.utils.JobInvokeUtil
 * @since 3.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JobInvokeInfo {
    /**
     * bean
     */
    private String bean;
    /**
     * method
     */
    private String method;
    /**
     * method params
     */
    private String params;

}
