// File: ShapeComparator.java
// Author: Amandeep Gill
// Contents: a class to compare two Shape objects

import java.util.*;

public class ShapeComparator {
    public static final Comparator<Shape> SHAPE_ORDER = new Comparator<Shape>() {
        public int compare(Shape s1, Shape s2) {
        //    Shape s1 = (Shape)o1;
        //    Shape s2 = (Shape)o2;

            int c = s1.sides().compareTo(s2.sides());

            if (c != 0) return c;

            else {
                double a1, a2;
                a1 = s1.area();
                a2 = s2.area();

                if (a1 == a2) {
                    double p1, p2;
                    p1 = s1.perimeter();
                    p2 = s2.perimeter();

                    if (p1 < p2) return -1;
                    else if (p1 > p2) return 1;
                    return 0;
                }

                if (a1 < a2) return -1;
                else if (a1 > a2) return 1;
                return 0;
            }
        }
    };
}
