/**
 * rest api interface
 * 项目标准接口
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * 
 */
export interface EditGroupReq { 
    /**
     * 
     */
    id: string;
    /**
     * 
     */
    outid?: number;
    /**
     * 
     */
    name: string;
    /**
     * 
     */
    icon?: string;
    /**
     * 
     */
    parent?: string;
    /**
     * 
     */
    paths?: Array<any>;
    /**
     * 
     */
    director?: string;
    /**
     * 
     */
    order: number;
    /**
     * 
     */
    isRegion?: boolean;
    /**
     * 
     */
    description?: string;
}