package example06;
//�ڼ�Ŭ����
public class CompactDisc extends Product {
	
	
	private String albumTtitle;
	private String artist;
	
	
	

	public CompactDisc(int productID, String description, String maker, int price, String albumTtitle, String artist) {
		super(productID, description, maker, price);
		this.albumTtitle = albumTtitle;
		this.artist = artist;
	}

	public String getAlbumTtitle() {
		return albumTtitle;
	}

	public String getArtist() {
		return artist;
	}

	@Override
	public void showInfo() {
		super.showInfo(); //����Ŭ������ �޼��带 ��������� ȣ��
		System.out.println("�ٹ� ���� >>" + this.getAlbumTtitle());
		System.out.println("���� >>" + this.getArtist());
	}
	
	

}
