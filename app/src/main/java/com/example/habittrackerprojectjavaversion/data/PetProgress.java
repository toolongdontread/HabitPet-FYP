package com.example.habittrackerprojectjavaversion.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "pet_progress")
public class PetProgress {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int imageId;
    private int progress;

    public PetProgress(int imageId, int progress) {
        this.imageId = imageId;
        this.progress = progress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
}
