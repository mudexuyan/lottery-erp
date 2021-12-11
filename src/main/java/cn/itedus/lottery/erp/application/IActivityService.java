package cn.itedus.lottery.erp.application;

import cn.itedus.lottery.erp.domain.activity.model.ActivityListPageReq;
import cn.itedus.lottery.erp.infrastructure.common.EasyResult;

/**
 * @description: 活动服务接口
 * @author: 小傅哥，微信：fustack
 * @date: 2021/12/11
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface IActivityService {

    /**
     * 查询活动分页数据
     * @param req   入参
     * @return      结果
     */
    EasyResult queryActivityListPage(ActivityListPageReq req);

}
