
package sample;

/**
* @author: Antonio
* Devolver el elemento más grande de un Array
* @param a array de int
* @return elemento más grande de a
*/
public class Max 
{
    public static int max(int[] a)
    {
        int i,m = 0;
        for (i=0;i<a.length;i++)
        {
            if(a[i]>m)
                m=a[i];
        }
        return m;
    }
}
