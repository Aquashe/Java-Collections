//1.LOOP THROUGHT HASHMAP

 for(Map.Entry<Integer,Integer> nodes:map.entrySet())
{
    if(nodes.getValue() >(nums.length/3))
        result.add(nodes.getKey());
}

for(int i=0;i<nums.length;i++)
{
  if(!(map.containsKey(nums[i])))
    map.put(nums[i],1);
  else
    map.computeIfPresent(nums[i],(k,v)->v+1);
}
