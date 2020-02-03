/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Short
 */
public class Image {
    private String path;
    private String name;

    /**
     *
     * @param name
     * @param path
     */
    public Image(String name, String path)
    {
        this.name =name;
        this.path = path;
    }

    /**
     *
     * @return
     */
    public String getName()
    {
        return name;
    }

    /**
     *
     * @return
     */
    public String getPath()
    {
        return path;
    }
}
