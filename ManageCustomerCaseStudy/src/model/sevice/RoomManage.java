package model.sevice;

import data.readWriteFile.ReadAndWriteRoom;
import model.entity.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomManage implements Management<Room> {
    private List<Room> rooms = new ArrayList<>();
    private ReadAndWriteRoom readAndWriteRoom = new ReadAndWriteRoom();

    public RoomManage() {
        this.rooms = this.readAndWriteRoom.readFile();
    }

    @Override
    public void add(Room room) {
        rooms.add(room);
        readAndWriteRoom.writeFile(rooms);
    }

    @Override
    public void edit(String id, Room room) {
        int index = findIndexById(id);
        rooms.set(index, room);
        this.readAndWriteRoom.writeFile(rooms);
    }

    @Override
    public void delete(String id) {
        int index = findIndexById(id);
        rooms.remove(index);
        this.readAndWriteRoom.writeFile(rooms);
    }

    @Override
    public int findIndexById(String id) {
        for (int i = 0; i < rooms.size(); i++) {
            if (id.equals(rooms.get(i).getIdPhong())) {
                return i;
            }
        }
        return -1;
    }

    public List<Room> findByStatusTrue() {
        List<Room> roomStatus = new ArrayList<>();
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).isStatus()) {
                roomStatus.add(rooms.get(i));
            }
        }
        return roomStatus;
    }

    public List<Room> findByStatusFalse() {
        List<Room> roomStatus = new ArrayList<>();
        for (int i = 0; i < rooms.size(); i++) {
            if (!rooms.get(i).isStatus()) {
                roomStatus.add(rooms.get(i));
            }
        }
        return roomStatus;
    }

    @Override
    public List<Room> getAll() {
        return rooms;
    }
}
