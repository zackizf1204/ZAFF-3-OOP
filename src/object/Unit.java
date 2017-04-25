package object;

import java.util.Random;

import object.item.Item;
import object.item.PowerUp;
import object.item.Recovery;

/**
 * Created by Fathur on 13-Apr-17.
 * NIM : 13515068
 * File : Unit.java
 */
public class Unit extends MapObject {
  private int maxHp;
  private int maxMp;
  private int currentHp;
  private int currentMp;
  private int strength;
  private int intelligence;
  private int mov;
  private int agi;
  private final int type;
  private boolean dead;
  private static String[] description = new String [12];
  private int remainingMov;
  private int jump;

  static {
    description[0] = new String("Cost 10 HP + 5 MP. Deal 3x Physical Damage to target");
    description[1] = new String("Cost 30 HP + 15 MP. Deal 5x Physical Damage to target");
    description[2] = new String("Cost 10 MP. Deal 3x Physical Damage to target and heal yourself");
    description[3] = new String("Cost 5 MP. Deal 2x Physical Damage to target");
    description[4] = new String("Cost all your current MP. Heal yourself");
    description[5] = new String("Cost 10 MP. Deal 2x Physical Damage to target and heal yourself");
    description[6] = new String("Cost 5 MP. Deal 5x Magic Damage to target");
    description[7] = new String("Cost 10 MP. Deal 5x Magic Damage to target and recover your MP");
    description[8] = new String("Cost half your current HP. Restore MP");
    description[9] = new String("Cost 5 MP. Deal 2.5x Physical Damage to target");
    description[10] = new String("Cost 10 MP. Deal 2x Physical Damage to target and heal yourself");
    description[11] =
        new String("Cost 15 MP. Deal 2x Physical Damage to target. Chance instant-kill");
  }

  /** Constructor Unit.
   */
  public Unit() {
    super();
    setObjectType();
    dead = false;
    maxHp = 100;
    maxMp = 50;
    currentHp = 100;
    maxMp = 100;
    strength = 10;
    intelligence = 10;
    mov = 5;
    agi = 10;
    type = 4;
    remainingMov = mov;
    jump = 1;
  }

  /**
   * Constructor Unit.
   * @param type type dari unit. 0 attacker, 1 tanker, 2 caster, 3 runner.
   * @param x lokasi Absis dari Unit.
   * @param y lokasi Ordinat dari Unit.
   */
  public Unit(int type,int x,int y) {
    super(x,y);
    setObjectType();
    dead = false;
    if (type == 0) {
      maxHp = 100;
      maxMp = 25;
      currentHp = 100;
      currentMp = 25;
      strength = 20;
      intelligence = 3;
      mov = 5;
      agi = 7;
      this.type = 0;
    } else if (type == 1) {
      maxHp = 200;
      maxMp = 40;
      currentHp = 200;
      currentMp = 40;
      strength = 15;
      intelligence = 1;
      mov = 5;
      agi = 5;
      this.type = 1;
    } else if (type == 2) {
      maxHp = 100;
      maxMp = 100;
      currentHp = 100;
      currentMp = 100;
      strength = 1;
      intelligence = 20;
      mov = 5;
      agi = 3;
      this.type = 2;
    } else if (type == 3) {
      maxHp = 150;
      maxMp = 30;
      currentHp = 150;
      currentMp = 30;
      strength = 5;
      intelligence = 5;
      mov = 7;
      agi = 10;
      this.type = 3;
    } else {
      maxHp = 100;
      maxMp = 50;
      currentHp = 100;
      maxMp = 100;
      strength = 10;
      intelligence = 10;
      mov = 5;
      agi = 10;
      this.type = 4;
    }
    remainingMov = mov;
    jump = 1;
  }

  /**
   * Menyerang target.
   * @param target target dari attack.
   */
  public void attack(Unit target) {
    Random rand = new Random();
    int n = rand.nextInt(100) + 1;
    if (n <= (target.agi * 2)) {
      //Attack Miss;
    } else {
      n = rand.nextInt(5) + 7;
      target.minusHp(strength * n / 10);
    }
  }

  /**
   * berpindah ke atas/bawah/kiri/kanan.
   * @param i arah gerakan.
   */
  public void move(int i) {
    assert mov > 0 : "Cannot Move";
    if (i == 0) { //Move up
      setOrdinat(getOrdinat() - 1);
      remainingMov--;
    } else if (i == 1) { //Move down
      setOrdinat(getOrdinat() + 1);
      remainingMov--;
    } else if (i == 2) { //Move left
      remainingMov--;
      setAbsis(getAbsis() - 1);
    } else if (i == 3) { //Move right
      setAbsis(getAbsis() + 1);
      remainingMov--;
    }
  }

  /**
   * menggunakan skill ke-i dengan target sebuah unit.
   * @param i skill yang ingin digunakan.
   * @param target target dari skill.
   */
  public void skill(int i,Unit target) {
    Random rand = new Random();
    int n = rand.nextInt(5) + 7;
    if (type == 0) {
      if (i == 1) {
        currentMp = currentMp - 5;
        currentHp = currentHp - 10;
        target.minusHp(3 * strength * n / 10);
      } else if (i == 2) {
        currentMp = currentMp - 15;
        currentHp = currentHp - 30;
        target.minusHp(5 * strength * n / 10);
      } else if (i == 3) {
        currentMp = currentMp - 10;
        target.minusHp(3 * strength * n / 10);
        addHp(3 * strength * n / 5);
      }
    }
    if (type == 1) {
      if (i == 1) {
        currentMp = currentMp - 5;
        target.minusHp(2 * strength * n / 10);
      } else if (i == 2) {
        addHp(currentMp * 5);
        currentMp = 0;
      } else if (i == 3) {
        currentMp = currentMp - 10;
        target.minusHp(2 * strength * n / 10);
        addHp(2 * strength * n / 5);
      }
    }
    if (type == 2) {
      if (i == 1) {
        currentMp = currentMp - 5;
        target.minusHp(5 * intelligence * n / 10);
      } else if (i == 2) {
        currentMp = currentMp - 20;
        target.minusHp(5 * intelligence * n / 10);
        addMp(5 * intelligence * n / 20);
      } else if (i == 3) {
        addMp(currentHp);
        currentHp = currentHp / 2;
      }
    }
    if (type == 3) {
      if (i == 1) {
        currentMp = currentMp - 5;
        target.minusHp(5 * strength * n / 20);
      } else if (i == 2) {
        currentMp = currentMp - 10;
        target.minusHp(2 * strength * n / 10);
        addHp(2 * strength * n / 20);
      } else if (i == 3) {
        currentMp = currentMp - 15;
        target.minusHp(2 * strength * n / 10);
        n = rand.nextInt(100);
        if (n < 5) {
          target.currentHp = 0;
        }
      }
    }
  }

  /**
   * Melakukan recovery.
   */
  public void recov() {
    addHp(20);
    addMp(10);
  }

  /**
   * Mengambil power-up.
   * @param pu Power-up yang akan diambil.
   */
  public void pick(PowerUp pu) {
    maxHp = maxHp + pu.getAddMaxHp();
    maxMp = maxMp + pu.getAddMaxMp();
    strength = strength + pu.getAddStrength();
    intelligence = intelligence + pu.getAddIntelligence();
    agi = agi + pu.getAddAgility();
    mov = mov + pu.getAddMov();
  }

  /**
   * mengambil recovery.
   * @param recov recovery yang akan diambil.
   */
  public void pick(Recovery recov) {
    addHp(recov.getAddHp());
    addMp(recov.getAddMp());
  }

  /**
   * mengambil item.
   * @param item item yang akan diambil.
   */
  public void pick(Item item) {
    if (item instanceof PowerUp) {
      PowerUp pu = (PowerUp) item;
      maxHp = maxHp + pu.getAddMaxHp();
      maxMp = maxMp + pu.getAddMaxMp();
      strength = strength + pu.getAddStrength();
      intelligence = intelligence + pu.getAddIntelligence();
      agi = agi + pu.getAddAgility();
      mov = mov + pu.getAddMov();
      item.setAbsis(-1);
      item.setOrdinat(-1);
    } else if (item instanceof Recovery) {
      Recovery recov = (Recovery) item;
      addHp(recov.getAddHp());
      addMp(recov.getAddMp());
      item.setAbsis(-1);
      item.setOrdinat(-1);
    }
  }

  public void setMaxHp(int x) {
    maxHp = x;
  }

  public void setMaxMp(int x) {
    maxMp = x;
  }

  public void setCurrentHp(int x) {
    currentHp = x;
  }

  public void setCurrentMp(int x) {
    currentMp = x;
  }

  public void setStrength(int x) {
    strength = x;
  }

  public void setIntelligence(int x) {
    intelligence = x;
  }

  public void setMov(int x) {
    mov = x;
  }

  public void setAgi(int x) {
    agi = x;
  }

  public int getMaxHp() {
    return maxHp;
  }

  public int getMaxMp() {
    return maxMp;
  }

  public int getCurrentHp() {
    return currentHp;
  }

  public int getCurrentMp() {
    return currentMp;
  }

  public int getStrength() {
    return strength;
  }

  public int getIntelligence() {
    return intelligence;
  }

  public int getMov() {
    return mov;
  }

  public int getAgi() {
    return agi;
  }

  public int getJump() {
    return jump;
  }

  /**
   * menambahkan currentHp sebesar x.
   * @param x jumlah Hp yang ditambahkan.
   */
  public void addHp(int x) {
    currentHp = currentHp + x;
    if (currentHp > maxHp) {
      currentHp = maxHp;
    }
  }

  /**
   * menambahkan currentMp sebesar x.
   * @param x jumlah Mp  yang ditambakah.
   */
  public void addMp(int x) {
    currentMp = currentMp + x;
    if (currentMp > maxMp) {
      currentMp = maxMp;
    }
  }

  public void setObjectType() {
    objectType = "Unit";
  }

  /**
   * Apakah target berada disebelah unit.
   * @param target target yang akan dicek
   * @return boolean apakah target berada disebelah.
   */
  public boolean isReachable(Unit target) {
    if ((getAbsis() == target.getAbsis()) && (getOrdinat() != target.getOrdinat())) {
      return ((getOrdinat() - target.getOrdinat()) == -1)
          || ((getOrdinat() - target.getOrdinat()) == -1);
    } else if ((getAbsis() != target.getAbsis()) && (getOrdinat() == target.getOrdinat())) {
      return (((getAbsis() - target.getAbsis()) == -1) || ((getAbsis() - target.getAbsis()) == -1));
    }
    return false;
  }

  /**
   * Apakah skill dapat digunakan.
   * @param i skill yang  akan digunakan.
   * @return skill bisa digunakan atau tidak.
   */
  public boolean isSkillUsabale(int i) {
    if (type == 0) {
      if (i == 1) {
        return ((currentHp > 10) && (currentMp >= 5));
      } else if (i == 2) {
        return ((currentHp > 30) && (currentMp >= 15));
      } else if (i == 3) {
        return (currentMp >= 10);
      }
    } else if (type == 1) {
      if (i == 1) {
        return (currentMp >= 5);
      } else if (i == 2) {
        return true;
      } else if (i == 3) {
        return (currentMp >= 10);
      }
    } else if (type == 2) {
      if (i == 1) {
        return (currentMp >= 5);
      } else if (i == 2) {
        return (currentMp >= 20);
      } else if (i == 3) {
        return true;
      }
    } else if (type == 3) {
      if (i == 1) {
        return (currentMp >= 5);
      } else if (i == 2) {
        return (currentMp >= 10);
      } else if (i == 3) {
        return (currentMp >= 15);
      }
    }
    return false;
  }

  /**
   * melakukan pengecekan apakah unit sudah Dead atau belum.
   */
  public void checkDead() {
    if (currentHp <= 0) {
      dead = true;
      setAbsis(-1);
      setOrdinat(-1);
    }
  }

  public boolean getDead() {
    return dead;
  }

  public String getSkillDescription(int i) {
    return description[type * 3 + (i - 1)];
  }

  /**
   * Mengurangi currentHp.
   * @param i jumlah currentHp yang akan dikurangi.
   */
  public void minusHp(int i) {
    currentHp = currentHp - i;
    if (currentHp < 0) {
      currentHp = 0;
    }
  }

  public void setRemainingMov() {
    remainingMov = mov;
  }
}
