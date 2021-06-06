package sound;

import dataprovider.interfaces.SoundProvider;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class SoundFactory implements SoundProvider{

    private Clip clip;

    public SoundFactory() {
    }

    @Override
    public void alienBomb() {
        try {
            AudioInputStream laserInpuStream = AudioSystem.getAudioInputStream(new File("audio/sounds/alienBeam.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(laserInpuStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void explosion() {
        try {
            AudioInputStream explosionInpuStream = AudioSystem.getAudioInputStream(new File("audio/sounds/damageSound.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(explosionInpuStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void alienBoss() {
        try {
            AudioInputStream laserInpuStream = AudioSystem.getAudioInputStream(new File("audio/sounds/bossSound.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(laserInpuStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void alienBonus() {
        try {
            AudioInputStream laserInpuStream = AudioSystem.getAudioInputStream(new File("audio/sounds/bonusSound.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(laserInpuStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void projectile() {
        try {
            AudioInputStream laserInpuStream = AudioSystem.getAudioInputStream(new File("audio/sounds/bulletSound.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(laserInpuStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void death() {
        try {
            AudioInputStream laserInpuStream = AudioSystem.getAudioInputStream(new File("audio/sounds/deathSound.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(laserInpuStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void hitmarker() {
        try {
            AudioInputStream laserInpuStream = AudioSystem.getAudioInputStream(new File("audio/sounds/hitmarkerSound.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(laserInpuStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void levelUp(){
        try {
            AudioInputStream laserInpuStream = AudioSystem.getAudioInputStream(new File("audio/sounds/levelUpSound.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(laserInpuStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void shield() {
        try {
            AudioInputStream laserInpuStream = AudioSystem.getAudioInputStream(new File("audio/sounds/shieldSound.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(laserInpuStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
