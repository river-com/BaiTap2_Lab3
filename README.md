# Bài Tập 2 - Lab 3: Ứng dụng Android Quản lý Thông tin Sinh viên & Điều hướng Intent

## 📋 Thông tin Sinh viên
- **Họ và tên:** Nguyễn Ngọc Huy
- **Mã sinh viên (MSV):** 2415053122119
- **Lớp:** 24T1
- **Tuổi:** 20
- **Email:** huy@gmail.com

---

## 🚀 Giới thiệu Dự án
Ứng dụng Android được phát triển bằng ngôn ngữ **Kotlin**, tuân thủ các tiêu chuẩn hiện đại của Android development:
1. **View Binding:** Thay thế `findViewById`, liên kết an toàn giữa mã nguồn Kotlin và các tệp giao diện XML.
2. **Scope Functions trong Kotlin:** Sử dụng thành thạo các hàm phạm vi (`apply`, `let`, `run`, `with`, `also`) để khởi tạo đối tượng, thao tác cấu hình và xử lý dữ liệu Null-safety.
3. **Đa màn hình & Intent:** Xây dựng 2 Activity (`MainActivity` và `SecondActivity`) và sử dụng explicit `Intent` để truyền dữ liệu sinh viên qua lại giữa hai màn hình một cách linh hoạt.

---

## 🔍 Cấu trúc Các Màn hình
- **Màn hình 1 (`MainActivity`):**
  - Hiển thị đầy đủ thông tin cá nhân sinh viên (Họ tên, MSV, Lớp, Tuổi, Email).
  - Có nút bấm "Chuyển sang màn hình 2" tích hợp `Intent` đính kèm đối tượng `Student`.
- **Màn hình 2 (`SecondActivity`):**
  - Nhận đối tượng `Student` qua `Intent` extra.
  - Hiển thị chi tiết thông tin nhận được.
  - Có nút bấm "Quay lại Màn hình 1" để điều hướng ngược lại.

---

## 🛠️ Chi tiết sử dụng Scope Functions
- `apply`: Khởi tạo đối tượng View Binding và cấu hình cấu trúc Activity.
- `run`: Khởi tạo các thao tác khối lệnh và thiết lập sự kiện click listener trên các Button.
- `with`: Truy cập trực tiếp các thuộc tính của đối tượng `Student` để gán dữ liệu vào TextView mà không cần lặp lại tên biến.
- `let`: Kiểm tra và xử lý an toàn dữ liệu nhận từ `Intent` (`intent.getSerializableExtra(...)?.let { ... }`).
- `also`: Thực hiện các tác vụ phụ (side-effects) như ghi log khi khởi tạo đối tượng `Student`.

---

## 📦 Quản lý Source Code với Git & GitHub
- Dự án được quản lý phiên bản qua Git với các commit tuần tự theo tiến độ:
  1. *Commit 1:* Khởi tạo cấu trúc project, Model sinh viên và giao diện XML 2 màn hình.
  2. *Commit 2:* Cài đặt View Binding, Scope Functions và Intent điều hướng giữa 2 Activity.
  3. *Commit 3:* Hoàn thiện tài liệu README.md và báo cáo tiến độ dự án.
- **Link Repository GitHub:** [https://github.com/river-com/BaiTap2_Lab3.git](https://github.com/river-com/BaiTap2_Lab3.git)
