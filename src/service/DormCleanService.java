package service;

import java.util.List;

import po.DormClean;
import po.PageInfo;

/**
 * @program: dormitorySystem
 * @description: 宿舍卫生服务接口
 * @author: Joyrocky
 * @create: 2019-04-24 15:18
 **/
public interface DormCleanService {
    //分页查询
    public PageInfo<DormClean> findPageInfo(Integer d_id, String d_dormbuilding, Integer pageIndex, Integer pageSize);

    public int addDormClean(DormClean dormclean);    //添加宿舍信息
    public int deleteDormClean(Integer g_id);   //删除宿舍信息
    public int updateDormClean(DormClean dormclean); //修改宿舍信息
    public DormClean findDormCleanById(Integer g_id);
    public List<DormClean> getAll();
}
