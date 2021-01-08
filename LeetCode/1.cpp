class Solution
{
public:
	vector<int> twoSum(vector<int> &nums, int target)
	{
		vector<int> output;
		for (int i = 0; i < nums.length(); i++)
		{
			for (int j = i + 1; j < nums.length(); j++)
			{
				if (nums[i] + nums[j] == target)
				{
					output.push_back(i);
					output.push_back(j);
				}
			}
		}
		return output;
	}
};