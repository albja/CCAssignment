/**
 * Created by jacobliu on 15/9/26.
 */
public class Solution06 {
    /*
    *   Since 20GB is too large to fit in memory, so we use merge sort which
    *   is external sort to sort the file.
    *   Suppose the memory size is XMB, we then divide the file into 20GB/XMB+1
    *   chunks. We first sort each chunk in memory and then merge the chunks one
    *   by one. For example, if we have 16 chunks, we first sort each chunk and save
    *   it back to the disk, we have 16 sorted chunks; Then we sort each pair of
    *   chunks and then we get 8 bigger sorted chunks; Next time we sort each pair
    *   of the bigger sorted chunks and then we get 4 bigger sorted chunks. Keep
    *   doing this, at last we can get 1 20GB sorted chunk in the disk.
    *   For n chunks, we need to sort n*(logn+1) times.
    * */
}
