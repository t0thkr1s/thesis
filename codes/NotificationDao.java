@Dao
public interface NotificationDao {
    @Insert
    void insertNotification(Notification notification);

    @Query("select * from Notification where username=:username")
    List<Notification> listNotifications(String username);

    @Delete
    void deleteNotification(Notification notification);

    @Query("delete from Notification")
    void deleteNotifications();
}