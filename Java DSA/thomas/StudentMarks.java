package thomas;
public class StudentMarks implements Comparable<StudentMarks>{

    public int maths;
    public int physics;
    


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + maths;
        result = prime * result + physics;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StudentMarks other = (StudentMarks) obj;
        if (maths != other.maths)
            return false;
        if (physics != other.physics)
            return false;
        return true;
    }

    public StudentMarks(int maths , int physics){
        this.maths = maths;
        this.physics=physics;
    }

    @Override
    public int compareTo(StudentMarks o) {
        // TODO Auto-generated method stub
        return o.maths - this.maths;
    }

    @Override
    public String toString() {
        return "StudentMarks [maths=" + maths + ", physics=" + physics + "]";
    }

    public int getMaths() {
        return maths;
    }

    public int getPhysics() {
        return physics;
    }




}
